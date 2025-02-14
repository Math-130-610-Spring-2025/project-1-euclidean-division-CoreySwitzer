import java.util.Scanner;
public class EuclideanDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dividend:");
        int dividend = input.nextInt();
        System.out.println("enter the divisor:");
        int divisor;
        divisor = input.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
    System.out.println(dividend + " = " + quotient + " * " + divisor + " + " + remainder);

    }
}