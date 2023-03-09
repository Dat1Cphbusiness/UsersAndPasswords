package passwordprotected;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserHandler {
    ArrayList<User> users = new ArrayList<>();
    File file;

    public UserHandler(String filename){
        file = new File(filename);

    }

    public boolean login(String username, String password) {
        for(User user: users){
            if(user.getName().equals(username) && user.getPassword().equals(password) )
                return true;
        }
        return false;
    }

    public boolean createUser(String username, String password) {
        for(User user: users){
            if(user.getName().equals(username))
                return false;
        }
        users.add(new User(username, password));
        return true;
    }

    public void loadUsers(){
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String input = scanner.nextLine();
                String[] values = input.split(",");
                users.add(new User(values[0], values[1]));
            }
        }
        catch (IOException e){
            System.out.println("The system is not working currently");
        }
    }

    public void saveUsers() {
        try{
            FileWriter writer = new FileWriter(file);
            for(User user:users){
                writer.write(user.getName() + "," + user.getPassword());
            }
            writer.close();
        }
        catch (IOException e){
            System.out.println("Sorry, the system is not working currently");
        }
    }
}
