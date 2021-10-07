package pl.jac.spock.user;

public class User {
    private String name;
    private Role role;
    private String mail;

    public User(String name, Role role, String mail) {
        this.name = name;
        this.role = role;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
