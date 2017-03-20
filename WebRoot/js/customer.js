function showDialogSearchCustomer(){
	var loader = "customer.do?reqCode=reqCode=list?"+$('#customerKeyword').val();
	showDialog('dlgCustomerSearch','center',loader);
}
function addSite(){
	var row = '<tr><th><table><tr><th>Scope En.</th><td><input name="scopeEn" class="siteInputs" id="scopeEn"></td><th>Address En.</th><td><input name="addressEn" class="siteInputs" id="adden"></td><td rowspan="3"><img src="images/buttons/removeIcon.png" onclick="removeRow(this)"></img></td></tr>'
			+'<tr><th>Scope Fa</th><td><input name="scopeFa" class="siteInputs" id="scopefa"></td><th>Address Fa</th><td><input name="addressFa" class="siteInputs" id="addfa"></td></tr>'
			+'<tr><th>Employee Number</th><td><input name="employeeNo" class="siteInputs" id="scopefa"></td></tr></table></td></tr>';
	$('table #siteTable').append(row);
}
function removeRow(x){
	$(x).parent().parent().parent().remove();
}