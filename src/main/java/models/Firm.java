package models;

public class Firm {
    private int firm_id;
    private String firm_name;

    public Firm(int firm_id, String firm_name) {
        this.firm_id = firm_id;
        this.firm_name = firm_name;
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
}
