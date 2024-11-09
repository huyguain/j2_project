package models;

public class ProductDetail {
    private int product_detail_id;
    private Product product;
    private String product_detail_type;
    private String getProduct_detail_description;

    public ProductDetail(int product_detail_id, Product product, String product_detail_type, String getProduct_detail_description) {
        this.product_detail_id = product_detail_id;
        this.product = product;
        this.product_detail_type = product_detail_type;
        this.getProduct_detail_description = getProduct_detail_description;
    }

    public ProductDetail() {
    }

    public int getProduct_detail_id() {
        return product_detail_id;
    }

    public void setProduct_detail_id(int product_detail_id) {
        this.product_detail_id = product_detail_id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProduct_detail_type() {
        return product_detail_type;
    }

    public void setProduct_detail_type(String product_detail_type) {
        this.product_detail_type = product_detail_type;
    }

    public String getGetProduct_detail_description() {
        return getProduct_detail_description;
    }

    public void setGetProduct_detail_description(String getProduct_detail_description) {
        this.getProduct_detail_description = getProduct_detail_description;
    }
}
