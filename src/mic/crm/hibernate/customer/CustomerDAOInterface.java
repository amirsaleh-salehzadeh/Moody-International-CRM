package mic.crm.hibernate.customer;

import mic.crm.common.customer.CustomerENT;
import mic.crm.common.customer.CustomerLST;

public interface CustomerDAOInterface {
	public CustomerENT save(CustomerENT ent);
	public CustomerLST getCustomerLST(CustomerLST lst);
	public void deleteCustomerENT(CustomerENT ent);
	public CustomerENT getCustomerENT(CustomerENT ent);
}
