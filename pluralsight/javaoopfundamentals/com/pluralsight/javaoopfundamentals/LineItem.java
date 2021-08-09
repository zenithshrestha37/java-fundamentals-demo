package com.pluralsight.javaoopfundamentals;

public class LineItem {

    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
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

    public int getPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "\n\t" + "LineItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                ", price=" + getPrice() +
                '}';
    }
}
