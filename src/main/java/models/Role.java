package models;

import java.util.ArrayList;

public class Role {
    private int role_id;
    private String role_name;
    private ArrayList<Account> accounts;

    public Role(int role_id, String role_name, ArrayList<Account> accounts) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.accounts = accounts;
    }

    public Role() {
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
