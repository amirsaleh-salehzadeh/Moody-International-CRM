package mic.crm.hibernate;

import mic.crm.tools.AMSException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.ConstraintViolationException;


public class BaseHibernateDAO {
	public static final int AIPEX_UNKNOWN = AMSException.AIPEX_UNKNOWN;
	public static final int AIPEX_DELETE = AMSException.AIPEX_DELETE;
	public static final int AIPEX_SAVE = AMSException.AIPEX_SAVE;
	public static final int AIPEX_SAVE_DUPLICATE = AMSException.AIPEX_SAVE_DUPLICATE;
	public Session getSession(){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		return sessionFactory.openSession();
	}
	public Session getSession4Query(){
		return HibernateSessionFactory.getSession();
	}
	public AMSException getAMSException(int operationType, Exception ex) {
		String msg = ex.getMessage();
		switch (operationType) {
		case AIPEX_DELETE:
			msg = "اشکال در حذف اطلاعات.";
			break;
		case AIPEX_SAVE:
			msg = "اشکال در ثبت اطلاعات.";
			break;
		case AIPEX_SAVE_DUPLICATE:
			msg = "رکورد مورد نظر قبلا ثبت شده است.";
			
		}
		AMSException e = getAMSException(msg, ex);
		e.setType(operationType);
		return e;

	}
	public AMSException getAMSException(String defaultMessage, Exception ex) {
		getSession().close();

		if (ex == null) {
			return new AMSException(defaultMessage);
		}

		ex.printStackTrace();

		if (ex.getMessage().indexOf(
				"Batch update returned unexpected row count from update") > -1) {
			defaultMessage = "رکوردی مورد نظر یافت نشد.";
		} else if (ex.getMessage().indexOf("a foreign key constraint fails") > -1) {
			defaultMessage = defaultMessage + "\n"
					+ "بدلیل ارتباط با سایر اطلاعات";
		} else if (ex.getCause().getMessage().indexOf("Duplicate entry") > -1) {
			defaultMessage = defaultMessage + "\n"
					+ "اطلاعات تکراری است.";
		} else if (ex instanceof ConstraintViolationException) {
			ConstraintViolationException cvex = (ConstraintViolationException) ex;
			defaultMessage = defaultMessage
					+ "\n"
					+ " بدلیل ارتباط با سایر اطلاعات یا محدودیتهای تغییر اطلاعاتی";
		}
		// else if(ex.getMessage().startsWith(""){}
		return new AMSException(defaultMessage, ex);
	}
}
