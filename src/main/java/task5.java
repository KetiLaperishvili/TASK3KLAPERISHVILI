import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double sumOfProducts = 0;
        double sumOfWeights = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter score " + i + ": ");
            double score = scanner.nextDouble();

            System.out.print("Enter weight for score " + i + ": ");
            double weight = scanner.nextDouble();


            sumOfProducts += score * weight;
            sumOfWeights += weight;
        }


        if (sumOfWeights == 0) {
            System.out.println("The sum of weights cannot be zero.");
        } else {

            double weightedAverage = sumOfProducts / sumOfWeights;


            System.out.printf("The weighted average is: %.2f%n", weightedAverage);
        }


        scanner.close();
    }
}
