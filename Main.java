package passwordprotected;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       public static void main(String[] args) {
        // load fil med brugernavne/passwords
        UserHandler userhandler = null;
        try {
            userhandler = new UserHandler("user.txt");
            userhandler.loadUsers();
        }catch(Exception e){
            // skriv til bruger og luk program
            System.out.println("Desværre kan vi ikke køre programmet lige nu");
            System.exit(0);
        }

         
        String userInput = textUI.getUserInput();

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
