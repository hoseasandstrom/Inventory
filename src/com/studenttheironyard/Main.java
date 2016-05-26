package com.studenttheironyard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    static InventoryItem createItem(String name, int qty, String category) {
        return null;
    }

    public static void createItem(Scanner scanner, ArrayList<InventoryItem> items) {
        System.out.println("Enter the name of the beer:");
        String text = scanner.nextLine();
        InventoryItem item = new InventoryItem();
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
            System.out.println(i + ". " + "[" + inventoryItem.qty + "]" + inventoryItem.name);
            i++;
        }
    }

        public static void main(String[] args)  {
            ArrayList<InventoryItem> items = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("1. Enter the beer into our inventory:");
                System.out.println("2. Remove beer from your inventory?");
                System.out.println("3. List the beer inventory:");


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

