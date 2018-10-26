package ssh.ft.action;

import com.opensymphony.xwork2.ActionSupport;
import ssh.ft.entity.Account;
import ssh.ft.service.AccountManager;

/**
 * @author chenchen
 * @date 2018/10/26 16:20
 * @Content:
 */
public class LoginAction extends ActionSupport {
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    private AccountManager accountManager;

    public AccountManager getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String login() {
        System.out.println("login........");
        if (accountManager.login(account.getUser(), account.getPaw())) {
            return SUCCESS;
        }
        setMsg("用户名或密码错误");
        return ERROR;
    }
}
