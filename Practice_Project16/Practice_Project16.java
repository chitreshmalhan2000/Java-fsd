package Practice_Project16;
import java.util.Scanner;
public class Practice_Project16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers for division:");

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int result = divide(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return dividend / divisor;
    }
}
