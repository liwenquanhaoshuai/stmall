package com.stmall.service;

import com.stmall.common.ServerResponse;
import com.stmall.vo.CartVo;

/**
 * Created by liweqnaun on 2019/1/7.
 */
public interface ICartService  {
    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
    ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);
    ServerResponse<CartVo> deleteProduct(Integer userId, String productIds);
    ServerResponse<CartVo> list(Integer userId);
    ServerResponse<CartVo> selectOrUnSelect(Integer userId,Integer productId, Integer checked);
    ServerResponse<Integer> getCartProductCount(Integer userId);
}
