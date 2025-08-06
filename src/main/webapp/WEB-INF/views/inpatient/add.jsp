<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>添加</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath}/inpatient/add">

    <table border="1">
        <tr>
            <td colspan="2">添加用户信息</td>
        </tr>

        <tr>
            <td>病人编号</td>
            <td>
                <input type="text" name="pId" />
            </td>
        </tr>
        <tr>
            <td>入院时间</td>
            <td>
                <input type="text" name="inrecordInDate"  readonly/>
            </td>
        </tr>
        <tr>
            <td>科室编号</td>
            <td>
                <input type="text" name="dId" />
            </td>
        </tr>
        <tr>
            <td>房间号</td>
            <td>
                <input type="text" name="inwdId"  />
            </td>
        </tr>
        <tr>
            <td>主治医生</td>
            <td>
                <input type="text" name="sId" />
            </td>
        </tr>
        <tr>
            <td>检查编号</td>
            <td>
                <input type="text" name="inemId" />
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