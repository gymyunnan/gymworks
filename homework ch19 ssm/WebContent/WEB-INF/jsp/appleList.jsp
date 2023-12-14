<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	苹果信息:
	<c:forEach items="${appleList}" var="apple">
	<br>
		${apple.id}&nbsp;&nbsp;&nbsp;&nbsp;
		${apple.name}&nbsp;&nbsp;&nbsp;&nbsp;
		${apple.color}&nbsp;&nbsp;&nbsp;&nbsp;
		${apple.price}<br>
	</c:forEach>
</body>
</html>