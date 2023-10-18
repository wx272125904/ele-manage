package com.neutech.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neutech.entity.Business;
import com.neutech.mapper.BusinessMapper;
import com.neutech.service.BusinessService;
import com.neutech.vo.LayuiVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessMapper businessMapper;



    @Override
    public LayuiVO listByPage(Integer pageNum, Integer pageSize) {
        //调用分页
        PageHelper.startPage(pageNum,pageSize);
        List<Business> businessList = businessMapper.listAll();
        PageInfo pageInfo = PageInfo.of(businessList);
        return LayuiVO.success(pageInfo.getTotal(),pageInfo.getList());
    }
}
