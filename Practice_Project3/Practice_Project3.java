package Practice_Project3;
public class Practice_Project3 {
	//method with no parameters.
    public void methodWithNoParams() {
        System.out.println("Method with no parameters called.");
    }
  
    //method with parameters.
    public void methodWithParams(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }

    //method returning a value.
    public int methodReturningValue(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Practice_Project3 obj = new Practice_Project3();

        obj.methodWithNoParams();

        obj.methodWithParams(5, 3);

        int result = obj.methodReturningValue(4, 6);
        System.out.println("Result of multiplication: " + result);

        int a = 10, b = 20;
        obj.methodWithParams(a, b);
        Practice_Project3.staticMethod();
    }
    
    //Static method.
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
