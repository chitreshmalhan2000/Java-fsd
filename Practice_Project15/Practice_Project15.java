package Practice_Project15;
public class Practice_Project15 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
            //e.printStackTrace();
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            throwCustomException();
        } catch (CustomException e) {
            System.out.println("Custom Exception: " + e.getMessage());
           // e.printStackTrace();
        }
    }

    public static int divide(int dividend, int divisor) throws ArithmeticException {
        return dividend / divisor;
    }
    public static void throwCustomException() throws CustomException {
        throw new CustomException("This is a custom exception.");
    }
}