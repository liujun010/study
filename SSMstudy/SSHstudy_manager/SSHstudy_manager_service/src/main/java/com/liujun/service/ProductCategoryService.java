package com.liujun.service;

import pojo.EasyUITree;

import java.util.List;

/**
 * Created by liujun on 2019/3/31.
 */
public interface ProductCategoryService {
    List<EasyUITree> findProductCategoryListByParentId(short parentid);
}
