import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    /**
     * @return
     */
    public double getPrice() {
        return price;
    }
}

public class RestaurantMenu {
    private static ArrayList<Item> menu = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize menu items
        menu.add(new Item("Pizza", 149));
        menu.add(new Item("Burger", 49));
        menu.add(new Item("Salad", 29));
        menu.add(new Item("HotDog", 75));
        menu.add(new Item("Samosa", 15));
        menu.add(new Item("Onion rings ", 79));
        menu.add(new Item("Sweet potato fries", 69));
        menu.add(new Item("Steamed vegetables", 99));
        menu.add(new Item("Chocolate cake ", 199));
        menu.add(new Item("Cheesecake", 69));
        menu.add(new Item("Ice cream sundae", 59));
        menu.add(new Item("Grilled salmon", 99));
        menu.add(new Item("Garlic bread", 49));
        menu.add(new Item("Soup of the day", 90));
        menu.add(new Item("Caesar salad", 29));
        menu.add(new Item("Bruschetta", 199));
        menu.add(new Item("Chawmean", 59));
        menu.add(new Item("pasta", 99));
        menu.add(new Item("Margherita pizza ", 299));
        menu.add(new Item("Classic burger", 199));
        
        

        System.out.println("Welcome to the Restaurant!");
        while (true) {
            System.out.println("\nMenu:");
            printMenu();
            System.out.println("\nEnter the item number to order or 0 to exit:");
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else if (choice > menu.size() || choice < 0) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }
            Item selectedItem = menu.get(choice - 1);
            System.out.println("Enter the quantity:");
            int quantity = sc.nextInt();
            System.out.printf("%d %s(s) added to your order.\n", quantity, selectedItem.getName());
            double totalPrice = quantity * selectedItem.getPrice();
            System.out.printf("Total price: Rs %.2f\n", totalPrice);
        }
        System.out.println("Thank you for visiting the Restaurant!");
    }

    private static void printMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("%d. %s (Rs- %.2f)\n", i + 1, menu.get(i).getName(), menu.get(i).getPrice());
        }
    }
}
