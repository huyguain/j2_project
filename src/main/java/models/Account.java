package models;

import java.util.ArrayList;

public class Account {
    private int account_id;
    private Role role;
    private String user_name;
    private String password;
    private Boolean active;
    private User user;
    private ArrayList<Order> orders;

    public Account() {
    }

    public Account(Role role, String username, String password, Boolean active, User user, ArrayList<Order> orders) {
        this.role = role;
        this.user_name = username;
        this.password = password;
        this.active = active;
        this.user = user;
        this.orders = orders;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return user_name;
    }

    public void setUsername(String username) {
        this.user_name = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}
