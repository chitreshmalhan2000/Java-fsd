package Practice_Project8;
public class Practice_Project8 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("StringBuffer: " + stringBuffer);

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("StringBuilder: " + stringBuilder);
    }
}
