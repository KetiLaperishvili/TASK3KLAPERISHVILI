import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();


            System.out.print("Enter the operator (+, -, *, //): ");
            String operator = scanner.next();


            int result;
            if (operator.equals("+")) {
                result = num1 + num2;
                System.out.println("The result is: " + result);
            } else if (operator.equals("-")) {
                result = num1 - num2;
                System.out.println("The result is: " + result);
            } else if (operator.equals("*")) {
                result = num1 * num2;
                System.out.println("The result is: " + result);
            } else if (operator.equals("//")) {
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                }
            } else {
                System.out.println("Invalid operator! Please use +, -, *, or //.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}