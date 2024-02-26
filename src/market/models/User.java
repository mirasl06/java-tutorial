package market.models;

import market.services.BaseService;

public class User extends BaseService {
    private int id;
    private String name;
    private String login;
    private String password;
    private String position;
    private String phoneNumber;

    public User(int id, String name, String login, String password, String position, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.position = position;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void printInfo() {
        System.out.printf("******************\n" +
                "ID: %s\n" +
                "NAME: %s\n" +
                "POSITION: %s\n" +
                "PHONE_NUMBER: %s\n" +
                "******************\n", id, name, position, phoneNumber);
    }
}
