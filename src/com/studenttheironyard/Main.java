package com.studenttheironyard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class Main {

    public static void createItem(Scanner scanner, ArrayList<InventoryItem> items) {
        System.out.println("Enter the item you would like to add to your inventory:");
        String text = scanner.nextLine();
        System.out.println("How many would you like to add?");
        int qty = Integer.valueOf(scanner.nextLine());
        InventoryItem item = new InventoryItem(text, qty);
        items.add(item);
        }



    public static void removeItem(Scanner scannner, ArrayList<InventoryItem> items) {
        System.out.println("Enter the line of the inventory item you wish to remove:");
        String numStr = scannner.nextLine();
        Integer num = Integer.valueOf(numStr);
        try {
            items.remove(num - 1);
            }
        catch (NumberFormatException e) {
            System.out.println("That is not a valid number!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That number isn't valid!");

        }
    }
    public static void listItem(ArrayList<InventoryItem> items) {
        System.out.println("Here is your current inventory:");
        int i = 1;
        for (InventoryItem inventoryItem : items) {
            System.out.println(i + ". " + "[" + inventoryItem.qty + "]" + inventoryItem.text);
            i++;
        }
    }






    public static void main(String[] args) {
        ArrayList<InventoryItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Add new item");
            System.out.println("2. Remove item from your inventory?");
            System.out.println("3. List my inventory:");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    //create new item
                    createItem(scanner, items);
                    break;

                case "2":
                    //toggle item
                    removeItem(scanner, items);
                    break;

                case "3":
                    listItem(items);
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }

    }
}

