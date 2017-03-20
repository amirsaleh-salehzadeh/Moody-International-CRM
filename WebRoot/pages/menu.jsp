<%@ page language="java" import="java.util.*" pageEncoding="windows-1256"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'menu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<table width="100%"  background="images/menu_bg.jpg" height="35">
		<tr>
			<td><a href="t_customer.do?reqCode=list"> Customer</a></td>
			<td><a href="t_auditor.do?reqCode=list">Auditor</a></td>
			<td><a href="t_user.do?reqCode=list">Users</a></td>
			<td width="100%"></td>
		</tr>
	</table>
  </body>
</html>
