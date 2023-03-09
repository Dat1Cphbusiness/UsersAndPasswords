package passwordprotected;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserHandler userHandler = new UserHandler("users.txt");
        Scanner scanner = new Scanner(System.in);
        TextUI textUI = new TextUI(userHandler, scanner);

        userHandler.loadUsers();

        System.out.println("Hello. Would you like to 1) Log in or 2) Create user? Please write 1 or 2 and press Enter.");
        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                textUI.loginMenu();
                break;
            case "2":
                textUI.createUserMenu();
                break;
            default:
                System.out.println("Goodbye");
        }

        userHandler.saveUsers();
    }
}
