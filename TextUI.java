package passwordprotected;

import java.util.Scanner;

public class TextUI {
    Scanner scanner;
    UserHandler userHandler;

    public TextUI(UserHandler userHandler, Scanner scanner){
        this.userHandler = userHandler;
        this.scanner = scanner;
    }
    public void loginMenu() {
        System.out.println("Please enter your username: ");
        String userName = scanner.nextLine();
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();
        if(userHandler.login(userName, password)){
            System.out.println("Welcome " + userName);
        }
        else{
            System.out.println("Sorry, the username or password is incorrect");
        }
    }

    public void createUserMenu() {
        System.out.println("Please enter a username: ");
        String userName = scanner.nextLine();
        System.out.println("Please enter a password: ");
        String password = scanner.nextLine();
        if(userHandler.createUser(userName, password)){
            System.out.println("Welcome " + userName);
        }
        else{
            System.out.println("Sorry, the username or password can not be used");
        }
    }
}
