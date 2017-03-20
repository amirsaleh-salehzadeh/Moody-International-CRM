package mic.crm.hibernate.customer;

import java.util.ArrayList;
import org.hibernate.*;

import mic.crm.common.customer.CustomerDetailsENT;
import mic.crm.common.customer.CustomerENT;
import mic.crm.common.customer.CustomerLST;
import mic.crm.hibernate.BaseHibernateDAO;
import mic.crm.tools.AMSUtililies;
import mic.crm.tools.NVL;

public class customerDAO extends BaseHibernateDAO implements CustomerDAOInterface{
	
	public CustomerENT save(CustomerENT ent){
		Session session = getSession();
		Transaction tr = null;
		try{
		tr = session.beginTransaction();
		session.saveOrUpdate(ent);
		ArrayList<CustomerDetailsENT> detailsENT = ent.getCustomerDetailsENTs();
		ArrayList<CustomerDetailsENT> detailsENT2 = new ArrayList<CustomerDetailsENT>();
		for (int i=0; i < detailsENT.size(); i++){
			detailsENT.get(i).setClientNo(ent.getClientNo());
			detailsENT2.add((CustomerDetailsENT) session.merge(detailsENT.get(i)));
		}
		tr.commit();
		session.clear();
		session.close();
		} catch (HibernateException e) {
			tr.rollback();
			e.printStackTrace();
		}
		return ent;
		
	}
	public CustomerLST getCustomerLST(CustomerLST lst){
		ArrayList<CustomerENT> customerENTs = new ArrayList<CustomerENT>();
		Query q = null;
		try{
			q = getSession().getNamedQuery("spGetCustomersTotalItems");
			q.setString(0, "%"+lst.getKeyword()+"%");
			int totalItems = NVL.getInt( q.uniqueResult() );
			lst.setTotalItems(totalItems);
			q = getSession().getNamedQuery("spGetCustomersList");
			q.setString(0, "%"+lst.getKeyword()+"%");
			q.setString(1, "%"+lst.getSort()+"%");
			q.setInteger(2, lst.getFirst());
			q.setInteger(3, lst.getPageSize());
			customerENTs = (ArrayList<CustomerENT>)q.list();
			lst.setCustomerENTs(customerENTs);
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		return lst;
	}
	
	public void deleteCustomerENT(CustomerENT ent){
		
	}
	
	public CustomerENT getCustomerENT(CustomerENT ent){
		Query q = null;
		try {
			q = getSession().getNamedQuery("sqlGetCustomerENT");
			q.setString(0, ent.getClientNo());
			ent = (CustomerENT)q.uniqueResult();
			q = getSession().getNamedQuery("sqlGetCustomerDetailENT");
			q.setString(0, ent.getClientNo());
			ArrayList<CustomerDetailsENT> detailENTs = (ArrayList<CustomerDetailsENT>)q.list();
			ent.setCustomerDetailsENTs(detailENTs);
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}
		return ent;
	}
public static void main(String[] args) {
	customerDAO customerDAO = new customerDAO();
	CustomerENT ent = new CustomerENT();
	ArrayList<CustomerDetailsENT> detailsENTs = new ArrayList<CustomerDetailsENT>();
	for (int i = 0 ; i < 5 ; i++){
		CustomerDetailsENT ent2 = new CustomerDetailsENT();
		ent2.setAddressEn("addressEn"+i);
		ent2.setAddressFa("addressFa"+i);
		ent2.setScopeEn("scopeEn"+i);
		ent2.setScopeFa("scopeFa22"+i);
		ent2.setEmployeeNo(i);
		ent2.setClientNo(ent.getClientNo());
		detailsENTs.add(ent2);
	}
	ent.setCustomerDetailsENTs(detailsENTs);
	ent.setAddContact("addContact222");
	ent.setClientNameEn("clientNameEn222");
	ent.setClientNameFa("تدل توودذود");
	ent.setFamilyN("familynameee");
	ent.seteMail("mailll");
	ent.setMobile("mobile");
	ent.setSiteStatus(3);
	ent.setName("name");
	ent.setPosition("position");
	
//	ent.setClientNo("clientNo02");
//	CustomerENT ent = new CustomerENT();
	ent.setClientNo("clii0");
	ent = new customerDAO().save(ent);
	AMSUtililies.printObject(ent);
	
}	
}
