package models;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private int order_id;
    private Date order_date;
    private String status;
    private Float total_money;
    private Account account;
    private ArrayList<OrderDetail> orderDetails;

    public Order(int order_id, Date order_date, String status, Float total_money, Account account) {
        this.order_id = order_id;
        this.order_date = order_date;
        this.status = status;
        this.total_money = total_money;
        this.account = account;
    }

    public Order() {
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getTotal_money() {
        return total_money;
    }

    public void setTotal_money(Float total_money) {
        this.total_money = total_money;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
