package com.stmall.service;

import com.github.pagehelper.PageInfo;
import com.stmall.common.ServerResponse;
import com.stmall.pojo.Product;
import com.stmall.vo.ProductDetailVo;

/**
 * Created by liweqnaun on 2019/1/5.
 */
public interface IProductService {
    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    ServerResponse<PageInfo> searchProduct(String productName,Integer productId, int pageNum, int pageSize);

    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword,Integer categoryId,int pageNum, int pageSize,String orderBy);
}
