package Practice_Project7;
public class Practice_Project7 { //OuterClass 
    private int outerField = 10;
    class InnerClass {
        void display() {
            System.out.println("Inner class method: outerField = " + outerField);
        }
    }

    // Method to instantiate and use the inner class
    void outerMethod() {
        InnerClass inner = new InnerClass();
        inner.display();
    }

    public static void main(String[] args) {
        Practice_Project7 outerObj = new Practice_Project7();
        outerObj.outerMethod();
    }
}
