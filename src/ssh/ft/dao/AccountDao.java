package ssh.ft.dao;

import ssh.ft.entity.Account;

/**
 * @author chenchen
 * @date 2018/10/26 16:21
 * @Content:
 */
public interface AccountDao {
    public Account findByUser(String user);
}
