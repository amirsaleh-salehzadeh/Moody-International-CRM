<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="logic" uri="/WEB-INF/struts-logic.tld" %>
<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld" %>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld" %>
<%@ taglib prefix="ams" uri="/WEB-INF/AMSTag.tld" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<script type="text/javascript" src="js/calendar/JsFarsiCalendar.js" ></script>
  	<script type="text/javascript" src="js/amirsaleh.message.js" ></script>
  	<script type="text/javascript" src="js/security/user.list.js" ></script>
  	<script type="text/javascript" src="js/jquery.form.js" ></script>
	<script type="text/javascript" src="jquery/ui/ui.draggable.packed.js"></script>
	<script type="text/javascript" src="tools/dialog/amsdialog.js"></script>
	  <link rel="stylesheet" href="css/calendar.css" type="text/css"></link>
   <bean:define id="error" name="error" type="java.lang.String"></bean:define>
	<bean:define id="success" name="success" type="java.lang.String"></bean:define>
</head>
  <body>
  <ams:message errorMessage="<%=error %>" successMessage="<%=success %>" ></ams:message>
  	  <ams:dialog styleId="dlgRolesEdit" loader="" title="" style="simple" screenPosition="center" onOKClick="confirmRoles()" >
	  </ams:dialog>
	  <ams:dialog styleId="dlgEditUser" loader="" title="" style="simple" screenPosition="center" onOKClick="confirmEditUser()" >
	  </ams:dialog>
	  <bean:define id="totalRows" name="userLST" property="totalItems" type="java.lang.Integer"></bean:define>
	  <bean:define id="currentPage" name="userLST" property="currentPage" type="java.lang.Integer"></bean:define>
	  <bean:define id="pageSize" name="userLST" property="pageSize" type="java.lang.Integer"></bean:define>
	  <ams:paginate currentPage="<%=currentPage%>" pageSize="<%=pageSize%>" totalRows="<%=totalRows%>" align="center">
		<form action="user.do" method="post" id="userListForm">
		 <table align="center" class="formTable">
   			<tr>
				<th >
					جستجو:
				</th>
				<td><html:text property="keyword" name="userLST"></html:text>
				</td>
				<td onclick="goToSearchUser();" style="cursor: pointer;">
					<img  src="images/buttons/search.png"></img>
				</td>
			</tr>
   		</table>
	    <table align="center" dir="rtl" class="dataList">
	    	<tr>
	    		<th>
	    			<input type="hidden" name="reqCode" id="reqCode" value="list" >
	    			<input type="hidden" name="language" value="farsi" >
	    		</th>
	    		<th align="center">
	    			ردیف
	    		</th>
	    		<th align="center" nowrap>
	    			نام کاربری
	    		</th>
<!--	    		<th align="center" nowrap>-->
<!--	    			تاریخ عضویت-->
<!--	    		</th>-->
	    		<th nowrap>
	    			نقش ها
	    		</th>
	    		<th align="center">
	    			ویرایش
	    		</th>
	    		<th>
	    			حذف
	    		</th> 
	    	</tr>
			<logic:iterate id="userList" property="userENTs" type="mic.crm.common.user.UserENT" name="userLST" indexId="rowId">
				<tr class="listData">
					<td width="10" align="center">
						<input type="checkbox" id="<%=userList.getUserName() %>" name="ids">
					</td>
		    		<td width="15" align="center">
		    			<%=(currentPage - 1) * 10 + rowId+1%>
		    		</td>
		    		<td align="center">
		    			<%=userList.getUserName() %>
		    		</td>
		    		<td align="center">
<!--		    			<%=userList.getDate() %>-->
		    		</td>
		    		<td align="center">
		    			<img id="<%=userList.getUserName() %>" src="images/buttons/role.png" style="cursor: pointer;" onclick="showDialogRoles(this)"></img>
		    		</td>
		    		<td align="center">
		    			<img id="<%=userList.getUserName() %>" onclick="window.location.replace('t_user.do?reqCode=edit&id=<%=userList.getUserName()%>')"  src="images/buttons/edit.png" style="cursor: pointer;"></img>
		    		</td>
		    	</tr>    
	    	</logic:iterate>
	    </table>
	</form>
    </ams:paginate>
  </body>
</html>

