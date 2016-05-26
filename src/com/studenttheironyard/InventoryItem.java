package com.studenttheironyard;

import java.util.ArrayList;

/**
 * Created by hoseasandstrom on 5/23/16.
 */


public class InventoryItem {
    String name;
    int qty;
    String category;

    public void createItem() {
        System.out.println("Creates Awesome!");
    }

    @Override
    public String toString() {
        return "InventoryItem{" +
                "text='" + name + '\'' +
                ", qty=" + qty +
                '}';
    }
}


