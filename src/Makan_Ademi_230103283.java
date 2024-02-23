import java.util.*;
import java.io.*;


public class Makan_Ademi_230103283 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaInterface service = new PizzaService();

        String login = "admin";
        String password = "2222";

        System.out.println("Welcome Adema's Pizza Spot!!!");
        System.out.println("Choose your role to login: ");
        System.out.print("""
                	Press 1 : Admin
                    Press 2 : Customer
                """);


        while (true) {
            try {
                int choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    switch (choice) {
                        case 1:
                            System.out.println("Enter login and password: ");
                            String adminLogin = scanner.nextLine();
                            String adminPassword = scanner.nextLine();

                            try {
                                if (login.equals(adminLogin) && password.equals(adminPassword)) {
                                    openAdminRole();
                                } else {

                                }
                            } catch (Exception e) {
                                System.out.println("ERROR");
                            }

                            break;
                        case 2:
                            openCustomerRole();
                            break;
                    }
                } else
                    System.out.print("You can ONLY enter numbers from 1 to 2 inclusive. ");
            } catch (Exception e) {
                System.out.println(e);
                System.out.print("ERROR: CHOOSE MUST CONTAIN DIGITS");
            }
        }
    }

    public static void openAdminRole(Scanner scanner, PizzaInterface pizzaService) {
        System.out.println("Welcome to ADMIN console.");
        System.out.println("Choose one of these operations: ");
        System.out.println("""
                Press 1 : Add Pizza
                Press 2 : Update Price
                Press 3 : Delete Pizza
                Press 4 : View All Pizza
                Press 5 : Search Pizza
                Press 6 : Exit
                """);
        int operation = scanner.nextInt();
        while (true) {
            try {
                if (operation >= 1 || operation <= 6) {
                    switch (operation) {
                        case 1:
                            System.out.println("Enter Details as name of Toppong, spice level(basic/mediate/full), description to add a New Topping...");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            searchPizza();
                            break;
                        case 6:
                            System.out.println("Thakns ADMIN. See you soon!");
                            System.exit(1);
                            break;
                    }
                } else
                    System.out.println("You can ONLY enter numbers from 1 to 6 inclusive. ");
            } catch (Exception e) {
                System.out.println(e);
                System.out.print("ERROR: CHOOSE MUST CONTAIN DIGITS");
            }
        }

    }

    public static void openCustomerRole(Scanner scanner, PizzaInterface pizzaService) {
        System.out.println("Welcome to CUSTOMER console.");
        System.out.println("Choose one of these operations: ");
        System.out.println("""
                Press 1 : Order pizza
                Press 2 : Pay Bill
                Press 3 : View All Pizza
                Press 4 : View your order
                Press 5 : Search Pizza
                Press 6 : Exit""");
        int operation = scanner.nextInt();
        while (true) {
            try {
                if (operation >= 1 || operation <= 6) {
                    switch (operation) {
                        case 1:
                            System.out.println("Enter Details as name of Toppong, spice level(basic/mediate/full), description to add a New Topping...");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            searchPizza();
                            break;
                        case 6:
                            System.out.println("Thakns CUSTOMER. See you soon!");
                            System.exit(1);
                            break;
                    }
                } else
                    System.out.print("You can ONLY enter numbers from 1 to 6 inclusive. ");
            } catch (Exception e) {
                System.out.println(e);
                System.out.print("ERROR: CHOOSE MUST CONTAIN DIGITS");
            }
        }

    }

    public static void searchPizza(Scanner scanner, PizzaInterface pizzaService) {
        System.out.println("Choose your Search type: ");
        System.out.println("""
                Press 1 : Search By Name
                Press 2 : Search By Id
                Press 3 : Search By Size""");

    }
}

class PizzaNotFoundException extends Exception {

}

