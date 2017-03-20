package mic.crm.common.customer;

import java.sql.Date;
import java.util.ArrayList;

public class CustomerENT {
	String clientNameEn;
	String clientNameFa;
	Integer siteStatus;
	String name;
	String familyN;
	String position;
	String mobile;
	Date issueDate;
	Date revisedDate;
	String addContact;
	String webSite;
	String eMail;
	ArrayList<CustomerDetailsENT> customerDetailsENTs = new ArrayList<CustomerDetailsENT>();
	String clientNo;

	public String getClientNo() {
		return clientNo;
	}

	public void setClientNo(String clientNo) {
		this.clientNo = clientNo;
	}

	public String getClientNameEn() {
		return clientNameEn;
	}

	public void setClientNameEn(String clientNameEn) {
		this.clientNameEn = clientNameEn;
	}

	public String getClientNameFa() {
		return clientNameFa;
	}

	public void setClientNameFa(String clientNameFa) {
		this.clientNameFa = clientNameFa;
	}

	public Integer getSiteStatus() {
		return siteStatus;
	}

	public void setSiteStatus(Integer siteStatus) {
		this.siteStatus = siteStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamilyN() {
		return familyN;
	}

	public void setFamilyN(String familyN) {
		this.familyN = familyN;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getRevisedDate() {
		return revisedDate;
	}

	public void setRevisedDate(Date revisedDate) {
		this.revisedDate = revisedDate;
	}

	public String getAddContact() {
		return addContact;
	}

	public void setAddContact(String addContact) {
		this.addContact = addContact;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public ArrayList<CustomerDetailsENT> getCustomerDetailsENTs() {
		return customerDetailsENTs;
	}

	public void setCustomerDetailsENTs(
			ArrayList<CustomerDetailsENT> customerDetailsENTs) {
		this.customerDetailsENTs = customerDetailsENTs;
	}

}
