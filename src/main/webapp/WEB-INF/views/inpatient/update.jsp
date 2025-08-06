<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>修改页面</title>
</head>
<body>

<form method="post" action="/inpatient/update">
    <table border="1">

        <tr>
            <td colspan="2">修改病人信息</td>
        </tr>
        <tr>
            <td>编号</td>
            <td>
                <input type="text" name="inrecordId" value="${ir.inrecordId}" readonly/>
            </td>
        </tr>
        <tr>
            <td>病人编号</td>
            <td>
                <input type="text" name="pId" value="${ir.pId}" readonly/>
            </td>
        </tr>
        <tr>
            <td>科室编号</td>
            <td>
                <input type="text" name="dId" value="${ir.dId}"/>
            </td>
        </tr>
        <tr>
            <td>房间号</td>
            <td>
                <input type="text" name="inwdId" value="${ir.inwdId}" />
            </td>
        </tr>
        <tr>
            <td>主治医生</td>
            <td>
                <input type="text" name="sId" value="${ir.sId }"/>
            </td>
        </tr>
        <tr>
            <td>检查编号</td>
            <td>
                <input type="text" name="inemId" value="${ir.inemId }"/>
            </td>
        </tr>
        <tr>
            <td>出院日期</td>
            <td>
                <input type="text" name="inrecordOutDate" value="${ir.inrecordOutDate }"/>
            </td>
        </tr>
        <tr>
            <td>
                <a href="${pageContext.request.contextPath}/inpatient/fanhui">返回</a>
            </td>
            <td>
                <input type="submit" value="提交" />
            </td>
        </tr>


    </table>

</form>

</body>
</html>