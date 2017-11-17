package org.launchcode.java.restaurant;

public class MenuItem {

    private double price;
    private String description;
    private Enum<Category> category;
    private boolean isNew;

    public MenuItem() {
        this.isNew = true;
    }

    public double getPrice() {
        return price;
    }

    public MenuItem setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MenuItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public Enum<Category> getCategory() {
        return category;
    }

    public MenuItem setCategory(Enum<Category> category) {
        this.category = category;
        return this;
    }

    public boolean isNew() {
        return isNew;
    }

    public MenuItem setNew(boolean aNew) {
        isNew = aNew;
        return this;
    }
}
