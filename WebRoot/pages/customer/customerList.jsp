<%@page import="mic.crm.common.customer.CustomerENT"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="mic.crm.common.customer.CustomerLST"%>
<%@ taglib prefix="logic" uri="/WEB-INF/struts-logic.tld" %>
<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<%@ taglib prefix="ams" uri="/WEB-INF/AMSTag.tld" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<meta name="author" content="" />
		<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
		<title>Marketing Add Customer</title>

	</head>
	<bean:define id="totalRows" name="list" property="totalItems" type="java.lang.Integer"></bean:define>
	<bean:define id="currentPage" name="list" property="currentPage" type="java.lang.Integer"></bean:define>
	<bean:define id="pageSize" name="list" property="pageSize" type="java.lang.Integer"></bean:define>
	<body>
		<ams:paginate currentPage="<%=currentPage%>" pageSize="<%=pageSize%>" totalRows="<%=totalRows%>" align="center">
			<form action="t_customer.do?reqCode=list" method="post">
				<table border="1">
					<tr>
						<td colspan="5" align="center">Search
							<html:text property="keyword" name="list"></html:text>
							<input type="hidden" value="list">
							<input type="submit" value="Search">
						</td>
					</tr>
					<tr>
						<th>
							Row
						</th>
						<th>
							&nbsp;
						</th>
						<th>
							ClientNo.
						</th>
						<th>
							CustomerNameEn
						</th>
						<th>
							CustomerNameFa
						</th>
						<th>
							edit
						</th>
					</tr>
					<%
						CustomerLST lst = (CustomerLST) request.getAttribute("list");
							ArrayList<CustomerENT> list = lst.getCustomerENTs();
							for (int i = 0; i < list.size(); i++) {
								CustomerENT ent = list.get(i);
					%>
					<tr>
						<td><%=i + 1%></td>
						<td>
							<input type="checkbox" name="clientNo"
								value="<%=ent.getClientNo()%>">
						</td>
						<td><%=ent.getClientNo()%></td>
						<td><%=ent.getClientNameEn()%></td>
						<td><%=ent.getClientNameFa()%></td>
						<td>
							<a
								href="t_customer.do?reqCode=edit&clientNo=<%=ent.getClientNo()%>"><%=ent.getClientNo()%></a>
						</td>
					</tr>
					<%
						}
					%>
				</table>
			</form>
		</ams:paginate>
		<div onClick="window.location.replace('t_customer.do?reqCode=new')"
			style="cursor: pointer;">
			New Customer
		</div>
	</body>
</html>
