package com.neutech.controller;

import com.neutech.service.BusinessService;
import com.neutech.vo.LayuiVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @GetMapping("/list")
    public String list(){
        return "business/list";
    }

    @GetMapping("/listByPage")
    @ResponseBody
    public LayuiVO listByPage(@RequestParam(defaultValue = "1") Integer pageNum,
                              @RequestParam(defaultValue = "1") Integer pageSize){
        return businessService.listByPage(pageNum,pageSize);
    }
}
