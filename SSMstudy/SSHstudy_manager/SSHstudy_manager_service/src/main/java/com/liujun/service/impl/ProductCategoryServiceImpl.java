package com.liujun.service.impl;

import com.liujun.mapper.ProductCategoryMapper;
import com.liujun.pojo.ProductCategory;
import com.liujun.pojo.ProductCategoryExample;
import com.liujun.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.EasyUITree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liujun on 2019/3/31.
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<EasyUITree> findProductCategoryListByParentId(short parentid) {
        ProductCategoryExample productCategoryExample = new ProductCategoryExample();
        ProductCategoryExample.Criteria criteria = productCategoryExample.createCriteria();
        criteria.andParentIdEqualTo(parentid);
        List<ProductCategory> productCategoryList = productCategoryMapper.selectByExample(productCategoryExample);

        List<EasyUITree> easyUITrees = new ArrayList<>(productCategoryList.size());

        for (ProductCategory productCategory:productCategoryList) {

            EasyUITree easyuiTree = new EasyUITree();

            easyuiTree.setId(productCategory.getId());
            easyuiTree.setText(productCategory.getName());
            easyuiTree.setState(productCategory.getParentId()==0?"closed":"open");
//            easyuiTree.setAttributes(productCategory.getParentId()+"");

            easyUITrees.add(easyuiTree);
        }

        return easyUITrees;

    }

}
