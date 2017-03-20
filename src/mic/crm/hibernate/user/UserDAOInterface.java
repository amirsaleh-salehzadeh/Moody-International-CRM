package mic.crm.hibernate.user;

import java.util.ArrayList;

import mic.crm.common.user.RoleENT;
import mic.crm.common.user.UserENT;
import mic.crm.common.user.UserLST;
import mic.crm.common.user.UserPassword;
import mic.crm.tools.AMSException;



public interface UserDAOInterface {
	public boolean register(UserENT ent) throws AMSException;
	public boolean checkUsernameValidity(String userName) throws AMSException;
	public UserLST getUserLST(UserLST lst) throws AMSException;
	public ArrayList<RoleENT> getRolesList() throws AMSException;
	public UserENT getUserENT(String username) throws AMSException;
	public boolean submitRoles(String[] roles, String username) throws AMSException;
	public boolean security(String username,String roles) throws AMSException;
	public UserENT saveUserENT(UserENT ent) throws AMSException;
	public boolean changePassword(UserPassword ent) throws AMSException;
	public void deleteUser(String username) throws AMSException;
}
