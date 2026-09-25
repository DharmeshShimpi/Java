import java.util.Scanner;

public class While_loop {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        } 
        
        // do-while loop executes atleast once, then checks the condition!
        // Syntax
        // do {
            // block of code;
        // } while(condition);

        System.out.println("Welcome "+name+"!");

        scanner.close();
    }
}
