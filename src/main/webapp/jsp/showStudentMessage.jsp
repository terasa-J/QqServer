<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/message/queryMessage" method="post">
查询条件：
<table width="100%" border=1>
<tr>
<td>
商品名称：<input name="message.name" />
</td>
<td><input type="submit" value="查询"/>
<!-- <input type="button" value="批量删除" onclick="deleteItems()"/> -->
</td>
</tr>
</table>
列表：
<table width="100%" border=1>
<tr>
	<td>选择(id)</td>
	<td>name</td>
	<td>comment</td>
	<td>img</td>
</tr>
<c:forEach items="${messageList}" var="message"> 
<tr>	
	<td><input type="checkbox" name="message.id" value="${message.id}"/></td>
	<td>${message.name}</td>
	<td>${message.comment}</td>
	<%-- <td><fmt:formatDate value="${message.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td> --%>
	<td>${message.img}</td>
	
	<%-- <td><a href="${pageContext.request.contextPath }/items/editItems.action?id=${item.id}">修改</a></td> --%>

</tr>
</c:forEach> 

</table>
</form>


</body>
</html>