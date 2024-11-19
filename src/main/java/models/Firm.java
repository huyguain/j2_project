package models;

import java.util.ArrayList;

public class Firm {
    private int firm_id;
    private String firm_name;
    private ArrayList<Category> categories;

    public Firm(int firm_id, String firm_name, ArrayList<Category> categories) {
        this.firm_id = firm_id;
        this.firm_name = firm_name;
        this.categories = categories;
    }

    public Firm() {
    }

    public int getFirm_id() {
        return firm_id;
    }

    public void setFirm_id(int firm_id) {
        this.firm_id = firm_id;
    }

    public String getFirm_name() {
        return firm_name;
    }

    public void setFirm_name(String firm_name) {
        this.firm_name = firm_name;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }
}
