<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>详情页面</title>
</head>
<body>

<table border="1">

    <tr>
        <th>编号</th>
        <th>病人编号</th>
        <th>入院日期</th>
        <th>科室编号</th>
        <th>房间号</th>
        <th>主治医生</th>
        <th>检查编号</th>
        <th>处方编号</th>
        <th>出院日期</th>
    </tr>
    <tr>
        <td>${ir.inrecordId}</td>
        <td>${ir.pId}</td>
        <td>${ir.inrecordInDate}</td>
        <td>${ir.dId}</td>
        <td>${ir.inwdId}</td>
        <td>${ir.sId}</td>
        <td>${ir.inemId}</td>
        <td>${ir.rId}</td>
        <td>${ir.inrecordOutDate}</td>
    </tr>

    <tr>
        <td colspan="6"><a href="${pageContext.request.contextPath}/inpatient/fanhui">返回</a>
    </tr>

</table>


</body>
</html>