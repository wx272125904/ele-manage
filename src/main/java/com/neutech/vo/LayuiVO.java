package com.neutech.vo;

public class LayuiVO {

    private Integer code;
    private String msg;
    private Long count;
    private Object data;

    public LayuiVO() {
    }

    public static LayuiVO success(Long count, Object data){
        LayuiVO layuiVO = new LayuiVO();
        layuiVO.code = 0;
        layuiVO.msg = "成功";
        layuiVO.count = count;
        layuiVO.data = data;
        return layuiVO;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Long getCount() {
        return count;
    }

    public Object getData() {
        return data;
    }
}
