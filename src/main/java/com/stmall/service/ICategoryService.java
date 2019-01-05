package com.stmall.service;

import com.stmall.common.ServerResponse;
import com.stmall.pojo.Category;

import java.util.List;

/**
 * Created by liweqnaun on 2019/1/5.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
