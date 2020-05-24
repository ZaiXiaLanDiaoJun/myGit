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
			str += "<option value="+data[i].name+">"+data[i].name+"</option>"
		}
		$("#tn").append(str)
	});
	
});
function sb() {
	var id = $("#bzid").val();
	$.post("sb.do",{"id":id},function (data) {
		if(data){
			alert("收被成功");
			location.href="list.do";
		}else{
			alert("收被失败");
			location.href="list.do";
		}
		
	},"json");
}
function xq() {
	var id = $("#bzid2").val();
	var str = "xq.do?id="+id
		
			location.href=str;
		
		
	
}
</script>
<body>

	<form action="list.do" method="post">
		请输入宿舍号<input type="text" name="susheid">
		<select name="status">
			<option value="">请选择
			<option value="1">晾晒中
			<option value="0">已被收
		</select>
		<select name="tname" id="tn">
			<option value="">请选择
		</select>
		<input type="submit" value="查询">
		<a href="add.jsp"><font color="red">添加</font></a>
	</form>
	<table>
  <tr>
    <th>id</th>
    <th>宿舍号</th>
    <th>负责老师</th>
    <th>被晾时间</th>
    <th>状态</th>
    <th>操作</th>
  </tr>
  <c:forEach items="${plist.list }" var="tt">
  <tr>
  
    <td>${tt.id }</td>
    <td>${tt.name }</td>
    <td>${tt.tname }</td>
    <td>${tt.uptime }</td>
    <td>${tt.status==1 ?"晾晒中":"已被收" }</td>
   	<td>
   		<input type="hidden" <c:if test="${tt.status ==1}">value="${tt.id }" id="bzid"> </c:if>
   		<a 
   		<c:if test="${tt.status ==1}">onclick="sb();">收被</c:if>
   		</a>	
   		<input type="hidden" <c:if test="${tt.status ==0}">value="${tt.id }" id="bzid2"> </c:if>
   		<a <c:if test="${tt.status ==0}">onclick="xq();">详情</c:if>
   		</a>
   	</td>
   
  </tr>
  </c:forEach>
  <tr>
  	<td colspan="5">
  	当前页${plist.pageNum }/${plist.pages },总共${plist.total }条数据
  	<a href="list.do?pageNum=${plist.firstPage }">首页</a>
  	<a href="list.do?pageNum=${plist.prePage }">上一页</a>
  	<a href="list.do?pageNum=${plist.nextPage }">下一页</a>
  	<a href="list.do?pageNum=${plist.lastPage }">末页</a>
  	</td>
  </tr>
</table>

</body>
</html>