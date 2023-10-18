<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <meta charset="utf-8">
    <title>商家列表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layuiadmin/layui/css/layui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/layuiadmin/style/admin.css">
</head>
<body>

<div class="layui-card layadmin-header">
    <div class="layui-breadcrumb" lay-filter="breadcrumb">
        <a lay-href="">主页</a>
        <a><cite>组件</cite></a>
        <a><cite>数据表格</cite></a>
        <a><cite>简单用法</cite></a>
    </div>
</div>

<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">商家列表</div>
                <div class="layui-card-body">
                    <table class="layui-hide" id="business-list"></table>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/layuiadmin/layui/layui.js"></script>
<script>
    layui.config({
        base: '${pageContext.request.contextPath}/layuiadmin/' //静态资源所在路径
    }).extend({
        index: 'lib/index' //主入口模块
    }).use(['index', 'table'], function () {
        let table = layui.table;
        table.render({
            elem: '#business-list',
            url: '${pageContext.request.contextPath}/business/listByPage',
            cols: [[
                {field: 'name', title: '商家名'},
                {field: 'address', title: '商家地址'},
                {field: 'blurb', title: '商家简介'},
                {field: 'startPrice', title: '起送费', sort: true},
                {field: 'deliveryPrice', title: '配送费'},
                {field: 'remarks', title: '备注'}
            ]],
            toolbar: 'default',
            request: {
                pageName: 'pageNum',
                limitName: 'pageSize'
            },
            page: true,
            limit: 1,
            limits: [1, 10, 20]
        })
    });
</script>
</body>
</html>
