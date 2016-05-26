package com.studenttheironyard;

/**
 * Created by hoseasandstrom on 5/24/16.
 */
public class Stout extends InventoryItem {
    public Stout(String name, int qty) {
        this.name = name;
        this.qty = qty;
        this.category = "Stout";
    }
    @Override
    public void createItem() {
        System.out.println("Almost as much as an IPA.");
    }
}
