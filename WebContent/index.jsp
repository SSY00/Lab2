<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询作者所著图书</title>
<style type="text/css">
body {
	background-image: url(images/cechy1e8xFKI.jpg);
}

.s1 {
	color: yellow;
}
</style>
</head>
<body class="s1">
<center>
<br>
<br>
<strong><h1 align="center">Welcome</h1></strong>
<br>
<br>
<br>
<br>
<br>

<form  action="TheBookOfAuthor" method="post">
<div >
<a href="showauthor.jsp">显示所有作者</a>


<p>请输入作者姓名<input type="text" id="searchbox" name="name"></p>
<input type="submit" value="搜索" id="searchbutton" >
</div>
            		
</form>
</center>
  
</body>
</html>