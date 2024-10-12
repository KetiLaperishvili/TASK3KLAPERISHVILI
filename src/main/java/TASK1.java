import java.util.Scanner;

public class TASK1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double a = getInput(scanner, "Enter number a: ");
        double b = getInput(scanner, "Enter number b: ");
        double c = getInput(scanner, "Enter number c: ");


        double result = calculateResult(a, b, c);


        System.out.println("Result: " + result);


        scanner.close();
    }


    private static double getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }


    private static double calculateResult(double a, double b, double c) {
        double numerator = Math.pow(a, 3) + Math.pow(b, 2) - Math.sqrt(c);
        double denominator = a * b + c;
        return numerator / denominator;
    }
}

