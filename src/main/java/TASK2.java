import java.util.Scanner;

public class TASK2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius : ");
        double radius = scanner.nextDouble();

        System.out.print("Enter height : ");
        double height = scanner.nextDouble();

        System.out.print("Enter slant height: ");
        double slantHeight = scanner.nextDouble();


        double surfaceArea = Math.PI * radius * (radius + slantHeight);


        double volume = (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;


        System.out.println("Surface Area : " + surfaceArea);
        System.out.println("Volume : " + volume);

        scanner.close();
    }
}