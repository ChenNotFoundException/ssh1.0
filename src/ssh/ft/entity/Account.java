package ssh.ft.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author chenchen
 * @date 2018/10/26 16:23
 * @Content:
 */
@Entity
@Table(name = "t_account", schema = "db_account", catalog = "")
public class Account {
    private Integer id;
    private String user;
    private String paw;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "paw")
    public String getPaw() {
        return paw;
    }

    public void setPaw(String paw) {
        this.paw = paw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Objects.equals(user, account.user) &&
                Objects.equals(paw, account.paw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, paw);
    }
}
