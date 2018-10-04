package com.reports.reportmaker;

import java.util.Scanner;

/**
 * menuMain support in the console
 */
class UserMenu {

    /**
     * Main menuMain
     *
     * @return selected value by the user (int)
     */
    static int menuMain() {

        System.out.println("Choose report to generate and push enter");
        System.out.println("-------------------------\n");
        System.out.println("1 - Total number of orders");
        System.out.println("2 - Number of orders from the customer with the given identifier");
        System.out.println("3 - Total amount of orders");
        System.out.println("4 - The total amount of orders to the customer with the indicated identifier");
        System.out.println("5 - List of all orders");
        System.out.println("6 - List of orders from the customer with the given identifier");
        System.out.println("7 - Average value of the order");
        System.out.println("8 - Average value of the order from the customer with the given identifier");
        System.out.println("9 - exit");

        System.out.print("Choose report to generate by entering a number from the menuMain: ");

        int choice = getIntChoice();
        while (choice > 9) {
            System.out.print("There is no such option! Try one more time or choose 9 to exit: ");
            choice = getIntChoice();
        }

        return choice;
    }

    /**
     * additional information about customer ID
     * @return selected customer ID by user (String)
     */
    static String menuGetCustomerIdentifier() {

        System.out.println("Choose client identifier: ");

        String choice = getStringChoice();
        while (choice.length() > 6 || choice.contains(" ")) {
            System.out.print("Customer ID can have only 6 chars without spaces");
            choice = getStringChoice();
        }
        return choice;
    }

    /**
     * additional information about report to generate
     *
     * @return selected option in menu (int)
     */
    static int menuGenerateReportOptions() {

        System.out.println("1 - Save report to file");
        System.out.println("2 - Show report");
        System.out.println("3 - Save to file and show");

        int choice = getIntChoice();
        while (choice > 3) {
            System.out.print("There is no such option! Try one more time: ");
            choice = getIntChoice();
        }
        return choice;
    }

    private static String getStringChoice() {
        String selection;
        Scanner input = new Scanner(System.in);
        selection = input.nextLine();
        return selection;
    }

    private static int getIntChoice() {
        int selection;
        Scanner input = new Scanner(System.in);
        selection = input.nextInt();
        return selection;
    }
}
