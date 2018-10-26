package ssh.ft.service.impl;

import ssh.ft.dao.AccountDao;
import ssh.ft.entity.Account;
import ssh.ft.service.AccountManager;

/**
 * @author chenchen
 * @date 2018/10/26 16:22
 * @Content:
 */
public class AccountManagerImpl implements AccountManager {
    private AccountDao dao;

    public AccountDao getDao() {
        return dao;
    }

    public void setDao(AccountDao dao) {
        this.dao = dao;
    }
    @Override
    public boolean login(String user, String paw) {
        Account account = dao.findByUser(user);
        if (account == null) {
            return false;
        }
        if (account.getPaw().equals(paw)) {
            return true;
        }
        return false;
    }
}
