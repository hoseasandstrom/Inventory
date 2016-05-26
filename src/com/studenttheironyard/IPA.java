package com.studenttheironyard;

/**
 * Created by hoseasandstrom on 5/24/16.
 */
public class IPA extends InventoryItem {
    public IPA (String name, int qty) {
        this.name = name;
        this.qty = qty;
        this.category = "IPA";

    }
    @Override
    public void createItem(){
        System.out.println("Your best choice.");
    }
}
