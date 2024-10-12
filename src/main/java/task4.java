import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the exchange rate from USD to EUR: ");
        double exchangeRate = scanner.nextDouble();


        System.out.print("Enter the amount in USD to be exchanged: ");
        double amountUSD = scanner.nextDouble();


        System.out.print("Enter the exchange fee percentage: ");
        double feePercentage = scanner.nextDouble();


        double feeMultiplier = 1 - feePercentage / 100;
        double eurReceived = amountUSD * exchangeRate * feeMultiplier;


        System.out.printf("Amount of EUR the user will receive: %.2f%n", eurReceived);


        scanner.close();
    }
}