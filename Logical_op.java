import java.util.Scanner;

public class Logical_op {
    
    public static void main(String[] args) {
        
        // && -> AND
        // || -> OR
        // ! -> NOT

        // int temp = 25;

        // if(temp > 30) {
        //     System.out.println("It's hot outside!");
        // } else if(temp >= 20 && temp <= 30) {
        //     System.out.println("It's warm outside!");
        // } else {
        //     System.out.println("It's cold outside!");
        // }

        Scanner scanner = new Scanner(System.in);

        System.out.print("You are playing a game! Press Q or q to quit: ");
        String response = scanner.nextLine();

        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("Playing the game!");
        } else {
            System.out.println("Thank you for playing!");
        }

        scanner.close();
    }
}
