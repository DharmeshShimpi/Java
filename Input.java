import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Input user name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input user age
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        // clear the nextLine scanner (\n)
        scanner.nextLine();

        // Input user fav. food
        System.out.print("What is you favourity food? ");
        String food = scanner.nextLine();

        // print all outputs
        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("Your like "+food);

        scanner.close();
    }
}