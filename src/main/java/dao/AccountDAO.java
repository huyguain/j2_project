package dao;

import Idao.IAccountDAO;
import dbcontext.DBContext;
import models.Account;
import models.Role;
import models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccountDAO implements IAccountDAO {
    Connection connection;
    PreparedStatement stm = null;
    ResultSet rs = null;
    DBContext db;

    public AccountDAO() {
        try {
            db = DBContext.getInstance();
            connection = db.getConnection();
            System.out.println("oke");
        } catch (Exception e) {
            System.out.println("Loi " + e);
        }
    }

    @Override
    public boolean checkAccount(String user_name, String password) {
        String query = "SELECT * FROM accounts WHERE user_name = ? AND password = ?";
        try {
            PreparedStatement psm = connection.prepareStatement(query);
            psm.setString(1, user_name);
            psm.setString(2, password);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                return true;
            }

//            if (rs.next()) {
//                Account account = new Account(rs.getString("user_name"), rs.getString("password"));
//                return account;
//            }
        } catch (Exception e) {
            String msg = e.toString();
            System.out.println("Check account error: " + msg);
        }
        return false;
    }

    @Override
    public void register(String fullname, String phone, String email, String gender, String user_name, String password, String role_id) {
        String userQuery = "INSERT INTO users(fullname, phone_number, email, gender) VALUES " +
                "(?,?, ?, ?)";
        String accountQuery = "INSERT INTO accounts(user_name, password, role_id, user_id) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement psm = connection.prepareStatement(userQuery, PreparedStatement.RETURN_GENERATED_KEYS);
            psm.setString(1, fullname);
            psm.setString(2, phone);
            psm.setString(3, email);
            psm.setString(4, gender);
            psm.executeUpdate();

            // Retrieve the generated user_id
            ResultSet userRs = psm.getGeneratedKeys();
            int userId = 0;
            while (userRs.next()) {
                userId = userRs.getInt(1);
            }
            PreparedStatement accountPsm = connection.prepareStatement(accountQuery);
            accountPsm.setString(1, user_name);
            accountPsm.setString(2, password);
            accountPsm.setString(3, role_id);
            accountPsm.setInt(4, userId);
            accountPsm.executeUpdate();
        } catch (SQLException e) {
            String msg = e.toString();
            System.out.println("Get account error: " + msg);
        }
    }

    @Override
    public Account getAccount(String user_name, String password) {
        String query =
                "SELECT accounts.account_id, accounts.user_name, accounts.password, accounts.active, roles.role_name FROM accounts INNER JOIN roles ON accounts.role_id = roles.role_id WHERE user_name = ? AND password = ?";
        try {
            PreparedStatement psm = connection.prepareStatement(query);
            psm.setString(1, user_name);
            psm.setString(2, password);
            ResultSet rs = psm.executeQuery();
            Account acc = null;
            while (rs.next()) {
                if (acc == null) {
                    acc = new Account();
                    Role role = new Role();

                    role.setRole_name(rs.getString("role_name"));
                    acc.setRole(role);

                    acc.setAccount_id(rs.getInt("account_id"));
                    acc.setUsername(rs.getString("user_name"));
                    acc.setPassword(rs.getString("password"));
                    acc.setActive(rs.getBoolean("active"));
                }
                return acc;
            }
        } catch (Exception e) {
            String msg = e.toString();
            System.out.println("Get account error: " + msg);
        }
        return null;
    }

    @Override
    public ArrayList<Role> getAllRole() {
        String sql = "SELECT * FROM roles";
        try {
            ArrayList<Role> listRole = new ArrayList<>();
            PreparedStatement psm = connection.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                Role role = new Role();
                role.setRole_id(rs.getInt("role_id"));
                role.setRole_name(rs.getString("role_name"));
                listRole.add(role);
            }
            return listRole;
        } catch (Exception e) {
            String msg = e.toString();
            System.out.println("Error: " + e);
        }
        return null;
    }
}
