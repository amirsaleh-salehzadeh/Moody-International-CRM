<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="mic.crm.common.common.SiteStatus"%>
<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@ taglib prefix="logic"
	uri="http://jakarta.apache.org/struts/tags-logic"%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="style.css" media="screen" />
		<title>Marketing Add Customer</title>
		<script type="text/javascript" src="js/customer.js">
</script>
		<script type="text/javascript" src="js/jquery.js">
</script>
		<%
			if (request.getParameter("clientNo") != null) {
		%>
		<script type="text/javascript">
$(document).ready(function() {
	$('#reqCode').val('update');
});
</script>
		<%
			}
		%>

	</head>

	<body>
		<form action="t_customer.do" method="post">
			<table class="mainT">
				<tr>
					<td colspan="2">
						Client No:
						<html:text name="customer" property="clientNo"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						Company Name En:
						<html:text name="customer" property="clientNameEn"></html:text>
					</td>
					<td>
						نام شرکت:
						<html:text name="customer" property="clientNameFa"></html:text>
					</td>
				</tr>
				<tr>
					<td>
						Site Status:
						<select name="siteStatus">
							<option value="<%=SiteStatus.Extension%>">
								Extension
							</option>
							<option value="<%=SiteStatus.Branch%>">
								Branch
							</option>
							<option value="<%=SiteStatus.Corporate%>">
								Corporate
							</option>
						</select>
					</td>
				</tr>
				<tr>
					<td colspan="6" align="center">
						<img src="images/buttons/addToIcon.png" style="cursor: pointer;"
							onclick="addSite();"></img>
					</td>
				</tr>
				<tr class="site">
					<td colspan="2">
						<table border="0" id="siteTable">
							<Tr>
								<td>
									<logic:iterate id="customerDetails" name="customer"
										property="customerDetailsENTs" indexId="rowId"
										type="mic.crm.common.customer.CustomerDetailsENT">
										<table>

											<tr>
												<th>
													Scope En.
												</th>
												<td>
													<html:text name="customerDetails" property="scopeEn"></html:text>
													<html:hidden name="customerDetails" property="id"></html:hidden>
													<!--													<input name="EnScope" class="siteInputs" id="scopeen">-->
												</td>
												<th>
													Address En.
												</th>
												<td>
													<html:text name="customerDetails" property="addressEn"></html:text>
												</td>
												<td rowspan="3">
													<img src="images/buttons/removeIcon.png"
														onclick="removeRow(this)"></img>
												</td>
											</tr>
											<tr>
												<th>
													Scope Fa
												</th>
												<td>
													<html:text name="customerDetails" property="scopeFa"></html:text>
												</td>
												<th>
													Address Fa
												</th>
												<td>
													<html:text name="customerDetails" property="addressFa"></html:text>
												</td>
											</tr>
											<tr>
												<th>
													Employee Number
												</th>
												<td>
													<html:text name="customerDetails" property="employeeNo"></html:text>
												</td>
											</tr>
										</table>
									</logic:iterate>
								</td>
							</Tr>
						</table>
					</td>
				</tr>
			</table>
			<div id="site-wrapper">
				<table>
					<tr>
						<td width="68%">
							<input name="reqCode" value="save" type="hidden"
								readonly="readonly" id="reqCode">
							<table align="center" class="data-table">
								<tr>
									<td valign="top">
										<label>
											Contacts:
										</label>
										<br />
										<br />
										<label>
											Name:
										</label>
										<html:text name="customer" property="name"></html:text>
										<br />
										<label>
											Family Name:
										</label>
										<html:text name="customer" property="familyN"></html:text>
										<br />
										<label>
											Mobile No.:
										</label>
										<html:text name="customer" property="mobile"></html:text>
									</td>
									<td>
										<br />
										<label>
											Aditional Contacts:
										</label>
										<html:text name="customer" property="addContact"></html:text>
										<br />
										<label>
											Position:
										</label>
										<html:text name="customer" property="position"></html:text>
										<br />
										<label>
											Web Site:
										</label>
										<html:text name="customer" property="webSite"></html:text>
										<br />
										<label>
											Email:
										</label>
										<html:text name="customer" property="eMail"></html:text>
									</td>
								</tr>
							</table>
							<div class="input" align="center">
								<input class="button" type="submit" name="cutomersave"
									value="Save" />
							</div>
						</td>
					</tr>
				</table>
		</form>
		</div>
	</body>
</html>
