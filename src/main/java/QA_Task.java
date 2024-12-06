import java.util.ArrayList;
import java.util.Scanner;

public class QA_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if the entered number is greater than 7
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Hello");
        }

        // Check if the entered name matches "John"
        System.out.print("Enter a name: ");
        scanner.nextLine(); // Clear buffer
        String name = scanner.nextLine();
        if (name.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        // Process an array of numbers to find those divisible by 3
        System.out.print("Enter numbers separated by space: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        ArrayList<Integer> divisibleBy3 = new ArrayList<>();

        for (String num : inputArray) {
            int value = Integer.parseInt(num);
            if (value % 3 == 0) {
                divisibleBy3.add(value);
            }
        }

        // Output numbers divisible by 3
        System.out.println("Numbers divisible by 3: " + divisibleBy3);

        // Analyze the given bracket sequence
        System.out.println("\nBracket sequence: [((())()(())]]");
        System.out.println("Is this sequence correct? No");
        System.out.println("Fix: Remove one extra closing square bracket to make it [((())()(())]");
    }
}
