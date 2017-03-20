<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'auditorEdit.jsp' starting page</title>

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
	<table align="center" class="data-table">
		<tr>
			<td><label>Auditor No. : </label><input type="text"
				name="clientNo" datatype="Require"
				msg="the Client No. is not allow null." />
			</td>
			<td><label>Language: </label><input type="text" name="clientNo"
				datatype="Require" msg="the Client No. is not allow null." />
			</td>
		</tr>
		<tr>
			<td width="43%"><label>Name *: </label><input type="text"
				name="companyNameEn" datatype="Require"
				msg="the Client No. is not allow null." />
			</td>
			<td width="57%"><label>Date of Birth: </label> <input
				type="text" name="companyNameEn" datatype="Require"
				msg="the Client No. is not allow null." />
			</td>
		</tr>
		<tr>
			<td width="43%"><label>Salutation: </label> <input name="Ms."
				type="radio" value="" /><label>Ms. </label> <input name="Mr."
				type="radio" value="" /><label>Mr. </label>
			</td>
			<td width="57%"><label>Email: </label> <input type="text"
				name="companyNameEn" datatype="Require"
				msg="the Client No. is not allow null." />
			</td>
		</tr>
		<tr>
			<td colspan="2"><label>Address: </label> <input
				name="companyNameEn" type="text" size="60" datatype="Require"
				msg="the Client No. is not allow null." />
			</td>
		</tr>
	</table>
</body>
</html>
