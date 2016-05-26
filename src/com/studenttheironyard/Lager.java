package com.studenttheironyard;

/**
 * Created by hoseasandstrom on 5/24/16.
 */
public class Lager extends InventoryItem {
    public Lager(String name, int qty){
        this.name = name;
        this.qty = qty;
        this.category = "Lager";

    }
    @Override
    public void createItem(){
        System.out.println("Almost never.");
    }
}
