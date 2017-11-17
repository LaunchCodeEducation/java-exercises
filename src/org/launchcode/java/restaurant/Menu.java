package org.launchcode.java.restaurant;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {

    private List<MenuItem> menuItems;
    private Date lastUpdated;
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public Menu() {
        this.lastUpdated = new Date();
        this.menuItems = new ArrayList<>();
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Menu setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        return this;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public Menu setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    private void printLastUpdated() {
        System.out.println(sdf.format(lastUpdated));
    }

    private void addNewMenuItems(List<MenuItem> menuItems) {
        for (MenuItem menuItem : this.menuItems) {
            menuItem.setNew(false);
        }
        this.menuItems.addAll(menuItems);
    }

    private void removeMenuItem(MenuItem menuItem) {
        if (!this.menuItems.contains(menuItem)) {
            throw new IllegalArgumentException("The menu item is not on the menu!");
        }

        this.menuItems.remove(menuItem);
    }

    private void removeMenuItems(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems) {
            if (!this.menuItems.contains(menuItem)) {
                throw new IllegalArgumentException("There is a menu item that is not on the menu");
            }

            this.menuItems.removeAll(menuItems);
        }
    }

    public String displaySimpleDate() {
        return sdf.format(lastUpdated);
    }
}
