<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件下载</title>
</head>
<body>
<h3>文件下载</h3>
<br>
<a href="javascript:window.location.href = 'download?filename=' + encodeURIComponent( '${requestScope.filename }' )">
${requestScope.filename }
</a>

</body>
</html>