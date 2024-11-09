package models;

import java.util.ArrayList;

public class Category {
    private int category_id;
    private String category_name;
    private Firm firm;
    private ArrayList<Product> products;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Firm getFirm() {
        return firm;
    }

    public void setFirm(Firm firm) {
        this.firm = firm;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Category(int category_id, String category_name, Firm firm, ArrayList<Product> products) {
        this.category_id = category_id;
        this.category_name = category_name;
        this.firm = firm;
        this.products = products;
    }

    public Category() {
    }
}
