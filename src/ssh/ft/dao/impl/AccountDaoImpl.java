package ssh.ft.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import ssh.ft.dao.AccountDao;
import ssh.ft.entity.Account;
import java.util.List;

/**
 * @author chenchen
 * @date 2018/10/26 16:21
 * @Content:
 */
public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao {
    @Override
    public Account findByUser(String user) {
        List<Account> list = (List <Account>) this.getHibernateTemplate().find("from Account a where a.user=?", user);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
