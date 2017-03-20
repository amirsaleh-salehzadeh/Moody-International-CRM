package mic.crm.hibernate.auditor;

import mic.crm.common.auditor.AuditorENT;
import mic.crm.common.auditor.AuditorLST;

public interface AuditorDAOInterface {
	public AuditorENT save(AuditorENT ent);
	public AuditorLST getAuditorLST(AuditorLST lst);
	public void deleteAuditorENT(AuditorENT ent);
	public AuditorENT getAuditorENT(AuditorENT ent);
}
