package Practice_Project4;
public class Practice_Project4 {
    public  Practice_Project4 () {
        System.out.println("Default constructor called.");
    }

    public  Practice_Project4 (int num) {
        System.out.println("Parameterized constructor with one integer parameter called. Value: " + num);
    }

    public  Practice_Project4 (Practice_Project4 obj) {
        System.out.println("Copy constructor called.");
    }

    public static void main(String[] args) {
        // Default constructor
    	Practice_Project4  defaultConstructor = new Practice_Project4 ();

        // Parameterized constructor
    	Practice_Project4  paramConstructor = new Practice_Project4(10);

        // Copy constructor
    	Practice_Project4 originalObj = new Practice_Project4 ();//here firstly default constructor will call first.
    	Practice_Project4 copyConstructor = new Practice_Project4 (originalObj);//now copy constructor will be called.
    }
}
