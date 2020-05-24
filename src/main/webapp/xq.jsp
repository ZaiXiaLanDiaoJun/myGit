<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<table>
  <tr>
    <th>编号</th>
    <th>班级</th>
    <th>时间</th>
    <th>状态</th>
  </tr>
  <tr>
    <td>${user.id }</td>
    <td>${user.name }</td>
    <td>${user.tname }</td>
    <td>${user.uptime }</td>
    <td>${user.status==1 ?"晾晒中":"已被收" }</td>
  </tr>
</table>

<a href="list.do"><input type="button" value="返回"></a>
</body>
</html>