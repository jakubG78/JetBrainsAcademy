package carsharing;

import carsharing.database.Company;
import carsharing.database.CompanyDao;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class CommandLineMenu {

    private static final String LOG_IN_AS_A_MANAGER = "1. Log in as a manager";
    private static final String EXIT_MENU = "0. Exit\n";
    private static final String COMPANY_LIST_MENU = "1. Company list";
    private static final String COMPANY_CREATE_MENU = "2. Create a company";
    private static final String BACK_MENU = "0. Back\n";

    private static final Scanner scanner = new Scanner(System.in);
    private static CompanyDao companyDao;

    private static void printManagerSubMenu() {
        boolean back = false;
        while (!back) {
            System.out.println(COMPANY_LIST_MENU);
            System.out.println(COMPANY_CREATE_MENU);
            System.out.println(BACK_MENU);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    List<Company> companies = companyDao.getAll();
                    if (companies.size() > 0) {
                        System.out.println("Company list:");
                        for (int i = 0; i < companies.size(); i++) {
                            System.out.println((i + 1) + ". " + companies.get(i).getName());
                        }
                        System.out.println();
                    } else {
                        System.out.println("The company list is empty!\n");
                    }
                    break;
                case "2":
                    System.out.println("Enter the company name:");
                    String company_name = scanner.nextLine();
                    companyDao.save(new Company(company_name));
                    System.out.println("The company was created!\n");
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println("Such value is not supported");
            }
        }
    }

    public static void printMainMenu(Connection connection) {
        companyDao = new CompanyDao("COMPANY", connection);
        boolean exit = false;
        while (!exit) {
            System.out.println(LOG_IN_AS_A_MANAGER);
            System.out.println(EXIT_MENU);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    printManagerSubMenu();
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Such value is not supported");
            }
        }
    }
}
