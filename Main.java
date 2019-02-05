import java.util.*;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        if(name.toLowerCase().equals("alice") || name.toLowerCase().equals("bob")){
            System.out.printf("Hello %s !! Welcome to ZipCode!!\n", name);
        }
    }
}
