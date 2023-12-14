<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="user" action="${pageContext.request.contextPath }/users/save" method="post">
		<fieldset>
        <legend>添加用户</legend>
        
        <p>
            <label>用户名:</label>
            <form:input path="name"/>
            <form:errors path="name"/>
        </p>
        <p>
            <label>密码:</label>
            <form:input path="pwd"/>
            <form:errors path="pwd"/>
        </p>
        <p>
            <label>创建日期:</label>
            <form:input path="date"/>(yyyy-MM-dd)
            <form:errors path="date"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" value="重置">
            <input id="submit" type="submit" value="添加">
        </p>
    	</fieldset>
    	<!-- 取出所有验证错误 -->
    	<%-- <form:errors path="*"/> --%>
	</form:form>
</body>
</html>