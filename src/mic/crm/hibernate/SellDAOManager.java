package mic.crm.hibernate;

import mic.crm.hibernate.auditor.AuditorDAO;
import mic.crm.hibernate.auditor.AuditorDAOInterface;
import mic.crm.hibernate.customer.CustomerDAOInterface;
import mic.crm.hibernate.customer.customerDAO;
import mic.crm.hibernate.user.UserDAO;
import mic.crm.hibernate.user.UserDAOInterface;



public class SellDAOManager {
	
	static CustomerDAOInterface _customerDAOInterface ;
	static UserDAOInterface _userDAOInterface ;
	static AuditorDAOInterface _auditorDAOInterface ;
	
	public static CustomerDAOInterface getCustomerDAOInterface(){
		if (_customerDAOInterface == null) {
			_customerDAOInterface = new customerDAO();
		}
		return _customerDAOInterface; 
	}
	public static AuditorDAOInterface getAuditorDAOInterface(){
		if (_auditorDAOInterface == null) {
			_auditorDAOInterface = new AuditorDAO();
		}
		return _auditorDAOInterface; 
	}
	public static UserDAOInterface getUserDAOInterface(){
		if (_userDAOInterface == null) {
			_userDAOInterface = new UserDAO();
		}
		return _userDAOInterface; 
	}
	
}