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

    @Override
    public String toString() {
        String printStatement = "";

        if (isNew) {
            printStatement += "New! \n";
        }
        printStatement += category + "\n";
        printStatement += description;


        return printStatement;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != getClass()) {
            return false;
        }

        MenuItem item = (MenuItem) obj;
        if (item.getCategory().equals(getCategory())) {
            if (item.getDescription().equals(getDescription())) {
                if (item.getPrice() == getPrice()) {
                    return true;
                }
            }
        }
        return false;
    }
}
