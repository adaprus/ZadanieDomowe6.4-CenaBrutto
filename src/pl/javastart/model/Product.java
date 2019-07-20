package pl.javastart.model;

public class Product {
    private String name;
    private String description;
    private double priceNet;
    private String category;

    public Product() {
    }

    public Product(String name, String description, double priceNet, String category) {
        this.name = name;
        this.description = description;
        this.priceNet = priceNet;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceNet() {
        return priceNet;
    }

    public void setPriceNet(double priceNet) {
        this.priceNet = priceNet;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
