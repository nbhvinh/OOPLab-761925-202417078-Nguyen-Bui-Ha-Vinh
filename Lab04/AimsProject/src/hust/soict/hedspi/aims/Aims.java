package hust.soict.hedspi.aims;

import java.util.Scanner;
import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initData();

        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    storeMenuHandler();
                    break;
                case 2:
                    updateStoreHandler();
                    break;
                case 3:
                    cartMenuHandler();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }


    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: ");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: ");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: ");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: ");
    }


    private static void storeMenuHandler() {
        int choice;
        do {
            store.print();
            storeMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1: 
                    System.out.print("Enter the title of media: ");
                    String title = scanner.nextLine();
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                case 4:
                    cartMenuHandler();
                    break;
            }
        } while (choice != 0);
    }

    private static void cartMenuHandler() {
        int choice;
        do {
            cart.print();
            cartMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: 
                    break;
                case 2: 
                    System.out.println("1. Sort by title | 2. Sort by cost");
                    int sortType = scanner.nextInt();
                    if(sortType == 1) cart.sortByTitle(); else cart.sortByCost();
                    break;
                case 3: 
                    break;
                case 5:
                    System.out.println("An order has been created. The cart is now empty.");
                    cart = new Cart();
                    choice = 0; 
                    break;
            }
        } while (choice != 0);
    }

    private static void updateStoreHandler() {
        System.out.println("1. Add media | 2. Remove media");
    }

    private static void initData() {
    	DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);        
    	Book book = new Book(); book.setTitle("Java Programming"); book.setCost(25.0f);
    	store.addMedia(dvd);
        store.addMedia(book);
    }
}