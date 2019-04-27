package com.liujun.controller;

import com.liujun.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.EasyUITree;

import java.util.List;

/**
 * Created by liujun on 2019/3/31.
 */
@Controller
@RequestMapping("/product_category")
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;

    @RequestMapping("/list")
    @ResponseBody
    public List<EasyUITree> getProductCategoryByParentId(@RequestParam(value = "id", defaultValue = "0") Short
                                                                 parentId) {
        List<EasyUITree> easyUITrees = productCategoryService.findProductCategoryListByParentId(parentId);
        return easyUITrees;
    }
}
