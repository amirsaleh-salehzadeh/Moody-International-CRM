package mic.crm.hibernate.auditor;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import mic.crm.common.auditor.AuditorENT;
import mic.crm.common.auditor.AuditorLST;
import mic.crm.common.customer.CustomerDetailsENT;
import mic.crm.common.customer.CustomerENT;
import mic.crm.common.customer.CustomerLST;
import mic.crm.hibernate.BaseHibernateDAO;
import mic.crm.tools.AMSUtililies;
import mic.crm.tools.NVL;

public class AuditorDAO extends BaseHibernateDAO implements AuditorDAOInterface {

	public void deleteAuditorENT(AuditorENT ent) {
		// TODO Auto-generated method stub
		
	}

	public AuditorENT getAuditorENT(AuditorENT ent) {
		Query q = null;
		try {
			q = getSession().getNamedQuery("sqlGetAuditorENT");
			q.setString(0, ent.getAuditorNo());
			ent = (AuditorENT)q.uniqueResult();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		}
		return ent;
	}

	public AuditorLST getAuditorLST(AuditorLST lst) {
		ArrayList<AuditorENT> auditorENTs = new ArrayList<AuditorENT>();
		Query q = null;
		try{
			q = getSession().getNamedQuery("spGetAuditTotalItems");
			q.setString(0, "%"+lst.getKeyword()+"%");
			int totalItems = NVL.getInt( q.uniqueResult() );
			lst.setTotalItems(totalItems);
			q = getSession().getNamedQuery("spGetAuditorList");
			q.setString(0, "%"+lst.getKeyword()+"%");
			q.setString(1, "%"+lst.getSort()+"%");
			q.setInteger(2, lst.getFirst());
			q.setInteger(3, lst.getPageSize());
			auditorENTs = (ArrayList<AuditorENT>)q.list();
			lst.setAuditorENTs(auditorENTs);
		}catch (HibernateException e) {
			e.printStackTrace();
		}
		return lst;
	}

	public AuditorENT save(AuditorENT ent) {
		Session session = getSession();
		Transaction tr = null;
		try{
		tr = session.beginTransaction();
		//ent = (AuditorENT) 
		session.save(ent);
		tr.commit();
		session.clear();
		session.close();
		} catch (HibernateException e) {
			tr.rollback();
			e.printStackTrace();
		}
		return ent;
	}
public static void main(String[] args) {
//	AuditorENT ent = new AuditorENT();
//	ent.setAddress("address1");
//	ent.setAuditorNo("02");
//	ent.setBirth("31/04/1364");
//	ent.setFname("fname");
//	ent.seteMail("email");
//	ent.setGender();
//	ent.setLanguage("languageeeee");
//	ent.setName("nameeee");
//	ent.setTel("telllllllllll");
	AuditorLST lst = new AuditorLST();
	lst.setKeyword("");
	lst.setSort("");
	lst.setPageSize(10);
	lst.setFirst(0);
	AuditorDAO dao = new AuditorDAO();
	AuditorLST lst2 = dao.getAuditorLST(lst);
	AMSUtililies.printObject(lst2);
	
}
}
