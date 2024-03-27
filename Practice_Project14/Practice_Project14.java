package Practice_Project14;
public class Practice_Project14 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
            //e.printStackTrace();
        }
    }
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}
