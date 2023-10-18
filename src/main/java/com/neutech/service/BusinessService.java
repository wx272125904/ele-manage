package com.neutech.service;

import com.neutech.vo.LayuiVO;

public interface BusinessService {

    LayuiVO listByPage(Integer pageNum, Integer pageSize);
}
