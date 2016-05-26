package com.studenttheironyard;

/**
 * Created by hoseasandstrom on 5/24/16.
 */
public class Porter extends InventoryItem {
    public Porter(String name, int qty){
        this.name = name;
        this.qty = qty;
        this.category = "Porter";
    }
    @Override
    public void createItem() {
        System.out.println("Pretty much middle of the road.");
    }
}
