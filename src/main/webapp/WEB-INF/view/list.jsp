<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<link href="<%=request.getContextPath() %>/css/index_work.css" rel="stylesheet">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="list" method="get">
	<input type="text" name="name">
	<input type="date" name="day1">
	<input type="date" name="day2">
	<input type="submit" value="查询">
</form>
	<table>
		<tr>
			<td>编号</td>
			<td>标题</td>
			<td>发布时间</td>
		</tr>
	<c:forEach items="${info.list}" var="u">
		<tr>
			<td>${u.id}</td>
			<td>${u.title}</td>
			<td>${u.created}</td>
	</c:forEach>
		<tr align="center">
			<td colspan="4">
				<a href="list?pageNum=1">首页</a>
				<a href="list?pageNum=${info.prePage}">上一页</a>
				<a href="list?pageNum=${info.nextPage}">下一页</a>
				<a href="list?pageNum=${info.pages}">尾页</a>
			</td>
		</tr>
	</table>
</body>
</html>