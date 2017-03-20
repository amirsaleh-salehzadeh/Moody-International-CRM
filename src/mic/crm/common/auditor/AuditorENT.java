package mic.crm.common.auditor;

import java.sql.Date;

public class AuditorENT {
		String auditorNo;
		String name;
		String fname;
		String language;
		String eMail;
		String tel;
		String address;
		String birth;
		Boolean gender;
		public String getAuditorNo() {
			return auditorNo;
		}
		public void setAuditorNo(String auditorNo) {
			this.auditorNo = auditorNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLanguage() {
			return language;
		}
		public void setLanguage(String language) {
			this.language = language;
		}
		public String geteMail() {
			return eMail;
		}
		public void seteMail(String eMail) {
			this.eMail = eMail;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getBirth() {
			return birth;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		public Boolean getGender() {
			return gender;
		}
		public void setGender(Boolean gender) {
			this.gender = gender;
		}
		
		
}
