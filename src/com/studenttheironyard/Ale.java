package com.studenttheironyard;

/**
 * Created by hoseasandstrom on 5/24/16.
 */
public class Ale extends InventoryItem {
    public Ale(String name, int qty){
        this.name = name;
        this.qty = qty;
        this.category = "Ale";
    }
    @Override
    public void createItem(){
        System.out.println("Only if you drink mass quatities.");
    }
}
