package mx.edu.utng.menu.model;

/**
 * Created by jony on 16/2/2017.
 */

public class User {
    private String id;
    private String user;
    private String password;
    private int age;
    private String firstname;
    private String lastname;

    public User(String id, String user,String password, int age, String firstname, String lastname) {
        this.id = id;
        this.user = user;
        this.password=password;
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public User() {
        this("","","",0,"","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
