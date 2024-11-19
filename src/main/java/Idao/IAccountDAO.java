package Idao;

import models.Account;
import models.Role;

import java.util.ArrayList;

public interface IAccountDAO {
    public boolean checkAccount(String user_name, String password);

    public void register(String fullname, String phone, String email, String gender, String user_name, String password, String role_id);

    public Account getAccount(String user_name, String password);

    public ArrayList<Role> getAllRole();
}
