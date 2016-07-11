package com.studenttheironyard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    public static ArrayList<InventoryItem> itemList = new ArrayList<>();

        public static void main(String[] args)  {
            Scanner scanner = new Scanner(System.in);
            for (InventoryItem item : itemList) {
                System.out.printf("%s. [%s] %s [%s]\n" , (itemList.indexOf(item) + 1),  item.qty, item.name, item.category);
            }

            while (true) {
                System.out.println("1. Enter the beer into our inventory:");
                System.out.println("2. Remove beer from your inventory?");
                System.out.println("3. List the beer inventory:");


                String option = scanner.nextLine();
                if (option.equalsIgnoreCase("1")) {

                    System.out.println("Enter in the new beer:");
                    String newItem = scanner.nextLine();
                    System.out.println("Enter in the quantity:");
                    String newQty = scanner.nextLine();

                    int qty = Integer.valueOf(newQty);
                    if(qty > 1){
                        String temp = newItem.concat("s");
                        newItem = temp;

            }

            System.out.println("Select the category of the new beer.");
            System.out.println("[1.] IPA");
            System.out.println("[2.] Stout");
            System.out.println("[3.] Porter");
            System.out.println("[4.] Ale");
            System.out.println("[5.] Lager");
            String newCategory = scanner.nextLine();
            InventoryItem item = createItem(newItem, qty , newCategory);
            if(item != null){
                itemList.add(item);
            }
            System.out.printf("You have added %s %s to your inventory.\n", newQty, newItem);

        }
    else if(option.equalsIgnoreCase("2")){

        System.out.println("Please select the item number to delete");
        for (InventoryItem item : itemList) {
            System.out.printf("%s. [ %s ] %s [%s]\n", (itemList.indexOf(item) +1), item.qty, item.name, item.category);
        }
        String choice = scanner.nextLine();
        int num = Integer.valueOf(choice);
        itemList.remove(num-1);
        System.out.println();
    }
    else if(option.equalsIgnoreCase("3")){

        System.out.println("Please select which item's quantity you wish to update");
        for (InventoryItem item : itemList) {
            System.out.printf("%s . [ %s ] %s [%s]\n", (itemList.indexOf(item) +1), item.qty, item.name, item.category);
        }
        String choice = scanner.nextLine();
        int num = Integer.valueOf(choice);
        InventoryItem item = itemList.get(num -1);

        System.out.printf("Please enter the new number of %s in your inventory.\n", item.name);
        String newItemAmount = scanner.nextLine();
        int amm = Integer.valueOf(newItemAmount);
        item.qty = amm;
        System.out.printf("%s. You now have [%s] %s\n", (itemList.indexOf(item)+ 1), amm, item.name);
    }
    else if(option.equalsIgnoreCase("4")){
        for (InventoryItem item : itemList) {
            System.out.printf("%s . [%s] %s [%s]\n", (itemList.indexOf(item) +1), item.qty, item.name, item.category);
        }
    }
}
}
public static InventoryItem createItem(String newItem, int newQty, String newCategory) {

        switch (newCategory){
        case "1":
        return new IPA(newItem, newQty);
        case "2":
        return new Stout(newItem, newQty);
        case "3":
        return new Porter(newItem, newQty);
        case "4":
        return new Ale(newItem, newQty);
        case "5":
        return new Lager(newItem, newQty);
default:
        System.out.println("Please choose different number");
        }
        return null;
        }
}

