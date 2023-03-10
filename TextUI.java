package passwordprotected;

import java.util.Scanner;

public class TextUI {
    Scanner scanner;
    UserHandler userHandler;

    public TextUI(UserHandler userHandler){
        this.userHandler = userHandler;
        this.scanner = new Scanner(System.in);
    }
    
    public String getUserInput(){
        System.out.println("Hello. Would you like to 1) Log in or 2) Create user? Please write 1 or 2 and press Enter.");
        return scanner.nextLine();
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
