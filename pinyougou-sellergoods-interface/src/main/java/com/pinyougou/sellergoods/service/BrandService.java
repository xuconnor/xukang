package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

import java.util.List;

public interface BrandService {

    //查询所有
    List<TbBrand> findAll();

    //分页显示
    PageResult findPage(Integer pageNum,Integer pageSize);

    //增加品牌
    void add(TbBrand brand);
}
