package com.stmall.service;

import com.stmall.common.ServerResponse;

import java.util.Map;

/**
 * Created by liweqnaun on 2019/1/10.
 */
public interface IOrderService {
    ServerResponse pay(Long orderNo, Integer userId, String path);
    ServerResponse aliCallback(Map<String,String> params);
    ServerResponse queryOrderPayStatus(Integer userId, Long orderNo);
}
