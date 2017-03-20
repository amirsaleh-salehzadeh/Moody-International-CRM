<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="mic.crm.common.customer.CustomerENT"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="mic.crm.common.customer.CustomerLST"%>
<%@page import="mic.crm.common.auditor.AuditorLST"%>
<%@page import="mic.crm.common.auditor.AuditorENT"%>
<%@ taglib prefix="logic" uri="/WEB-INF/struts-logic.tld" %>
<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<%@ taglib prefix="ams" uri="/WEB-INF/AMSTag.tld" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<meta name="author" content="" />
		<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
		<title>Auditor List</title>

	</head>
	<bean:define id="totalRows" name="list" property="totalItems" type="java.lang.Integer"></bean:define>
	<bean:define id="currentPage" name="list" property="currentPage" type="java.lang.Integer"></bean:define>
	<bean:define id="pageSize" name="list" property="pageSize" type="java.lang.Integer"></bean:define>
	<body>
		<ams:paginate currentPage="<%=currentPage%>" pageSize="<%=pageSize%>" totalRows="<%=totalRows%>" align="center">
			<form action="">
				<table>
					<tr>
						<th>
							Row
						</th>
						<th>
							&nbsp;
						</th>
						<th>
							AuditorNo.
						</th>
						<th>
							Name
						</th>
						<th>
							Family Name
						</th>
						<th>
							edit
						</th>
					</tr>
					<%
						  AuditorLST lst = (AuditorLST) request.getAttribute("list");
							ArrayList<AuditorENT> list = lst.getAuditorENTs();
							for (int i=0; i < list.size(); i++) {
								AuditorENT ent = list.get(i); 
					%>
					<tr>
						<td><%=i + 1%></td>
						<td>
							<input type="checkbox" name="AuditorNo"
								value="<%=ent.getAuditorNo()%>">
						</td>
						<td><%=ent.getAuditorNo()%></td>
						<td><%=ent.getName()%></td>
						<td><%=ent.getFname()%></td>
						<td>
							<a
								href="t_auditor.do?reqCode=edit&clientNo=<%=ent.getAuditorNo()%>"><%=ent.getAuditorNo()%></a>
						</td>
					</tr>
					<%
						}
					%>
				</table>
			</form>
		</ams:paginate>
		<div onClick="window.location.replace('t_auditor.do?reqCode=new')"
			style="cursor: pointer;">
			New Auditor
		</div>
	</body>
</html>
