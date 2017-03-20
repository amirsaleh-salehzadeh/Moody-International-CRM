<%@ page language="java" import="java.util.*"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="tiles" uri="http://struts.apache.org/tags-tiles"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title><tiles:getAsString name="title" />
		</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<script type="text/javascript" src="js/jquery.js"></script>
	</head>
	<body dir="ltr" bgcolor="white">
		<table border="0" width="1024" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="151">
					<img src="images/logo.jpg"></img>
				</td>
				<td  align="left" valign="bottom" >
					<tiles:insert attribute="menu" />
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<div id="mainBody">
						<tiles:insert attribute="body" />
					</div>
				</td>
			</tr>
		</table>
	</body>
</html>
