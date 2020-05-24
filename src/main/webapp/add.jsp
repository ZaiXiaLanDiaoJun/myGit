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
<script type="text/javascript">
$(function () {
	$.post("list2.do",function (data) {
		var str = "";
		for(var i in data){
			str += "<option value="+data[i].id+">"+data[i].name+"</option>"
		}
		$("#tn").append(str)
	});
	
});
</script>
<body>
	<form action="add.do" method="post">
		请输入宿舍号:<input type="text" name="name"><br>
		请选择老师:<select name="tname" id="tn">
		</select><br>
		<input type="submit" value="晾被">
	</form>
</body>
</html>