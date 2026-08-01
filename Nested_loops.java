import java.util.Scanner;

public class Nested_loops {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = ""; // why not works when used char symbol = '';?
        // because char symbol = ''; cannot be empty string! instead use -- char symbol = scanner.next().char(0);

        System.out.print("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter symbol to use: ");
        symbol = scanner.next(); // can we did not used .nextLine() here? Why do we used .next only?
        // because using .nextLine() directly after .nextInt() results in skipping of it because of \n when you pressed enter button. The .next() reads until the first space.
        
        for(int i = 1; i<= rows; i++) {
            System.out.println(); //to go to next line
            for(int j = 1; j<= columns; j++) {
                System.out.print(symbol); // we did not used "println" here because we want j loop to print the symbol in one line instead of new line!
            }
        }

        scanner.close();

    }
}
