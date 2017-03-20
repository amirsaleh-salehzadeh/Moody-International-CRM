package mic.crm.common.user;

import java.util.ArrayList;


public class UserENT {
	String userName;
	UserPassword password = new UserPassword();
	String date;
	String name;
	String familyName;
	String address;
	String nationalID;
	String emailAddress;
	String tel;
	String dob;
	ArrayList<UserRoleENT> userRoleENTs = new ArrayList<UserRoleENT>();
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserPassword getPassword() {
		return password;
	}
	public void setPassword(UserPassword password) {
		this.password = password;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ArrayList<UserRoleENT> getUserRoleENTs() {
		return userRoleENTs;
	}
	public void setUserRoleENTs(ArrayList<UserRoleENT> userRoleENTs) {
		this.userRoleENTs = userRoleENTs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNationalID() {
		return nationalID;
	}
	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
