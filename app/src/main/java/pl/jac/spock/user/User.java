package pl.jac.spock.user;

public class User {
    private String name;
    private Role category;
    private String mail;

    public User(String name, Role category, String mail) {
        this.name = name;
        this.category = category;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getCategory() {
        return category;
    }

    public void setCategory(Role category) {
        this.category = category;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
