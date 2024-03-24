package Practice_Project1;
public class Practice_Project1 {
	 public static void main(String[] args) {
	        // Implicit type casting (widening)
	        int intValue = 10;
	        double doubleValue = intValue; // int is implicitly cast to double
	        System.out.println("Implicit casting: int to double: " + doubleValue);

	        // Explicit type casting (narrowing)
	        double doubleVal = 15.75;
	        int intVal = (int) doubleVal; // double is explicitly cast to int
	        System.out.println("Explicit casting: double to int: " + intVal);
	    }
	}
