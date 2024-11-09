package models;

import java.util.ArrayList;

public class OrderDetail {
    private int order_details_id;
    private Product product;
    private int quantity;
    private Float product_price;
    private Order order;

    public OrderDetail(int order_details_id, Product product, int quantity, Float product_price, Order order) {
        this.order_details_id = order_details_id;
        this.product = product;
        this.quantity = quantity;
        this.product_price = product_price;
        this.order = order;
    }

    public OrderDetail() {
    }

    public int getOrder_details_id() {
        return order_details_id;
    }

    public void setOrder_details_id(int order_details_id) {
        this.order_details_id = order_details_id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Float product_price) {
        this.product_price = product_price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
