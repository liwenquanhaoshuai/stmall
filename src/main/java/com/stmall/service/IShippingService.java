package com.stmall.service;

import com.github.pagehelper.PageInfo;
import com.stmall.common.ServerResponse;
import com.stmall.pojo.Shipping;

/**
 * Created by liweqnaun on 2019/1/8.
 */
public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId, Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
