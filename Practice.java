import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter values separated by comma/space: ");
        String userInput = scanner.nextLine();
        
        String[] values = userInput.split("[,]+");

        // Access values using indexes
        System.out.println("First value: " + values[0]);
        System.out.println("Second value: " + values[1]);
        // ...
    }
}