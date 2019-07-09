package com.stmall.common;

import com.stmall.util.PropertiesUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by liweqnaun on 2019/7/8.
 */
public class RedisPool {
    private static JedisPool pool;
    private static Integer maxTotal = Integer.parseInt(PropertiesUtil.getProperty("redis.max.total", "20"));
    private static Integer maxIdle = Integer.parseInt(PropertiesUtil.getProperty("redis.max.idle", "10"));
    private static Integer minIdle = Integer.parseInt(PropertiesUtil.getProperty("redis.min.idle", "2"));
    private static Boolean testOnBorrow = Boolean.parseBoolean(PropertiesUtil.getProperty("redis.test.borrow", "true"));
    private static Boolean  testOnReturn = Boolean.parseBoolean(PropertiesUtil.getProperty("redis.test.return", "20"));

    private static String redisIP = PropertiesUtil.getProperty("redis.ip");
    private static Integer redisPort = Integer.parseInt(PropertiesUtil.getProperty("redis.port"));

    private static void  initPool() {
        JedisPoolConfig config = new JedisPoolConfig();

        config.setBlockWhenExhausted(true);//连接耗尽的时候选择阻塞
        config.setMaxTotal(maxTotal);
        config.setMaxIdle(maxIdle);
        config.setMinIdle(minIdle);
        config.setTestOnBorrow(testOnBorrow);
        config.setTestOnReturn(testOnReturn);

        pool = new JedisPool(config, redisIP, redisPort, 1000 * 2);
    }
    static {
        initPool();
    }
    public static Jedis getJedis() {
        return pool.getResource();
    }
    public static void returnBrokenResource(Jedis jedis) {
        pool.returnBrokenResource(jedis);
    }
    public static void returnResource(Jedis jedis) {
        pool.returnResource(jedis);
    }


}
