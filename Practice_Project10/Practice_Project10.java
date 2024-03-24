package Practice_Project10;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Practice_Project10 {
    public static void main(String[] args) {
        // Example 1: Matching a simple pattern
        String text1 = "The cat sat on the mat.";
        String pattern1 = "cat";
        boolean matches1 = Pattern.matches(pattern1, text1);
        System.out.println("Example 1: Pattern \"" + pattern1 + "\" matches? " + matches1);

        // Example 2: Using Pattern and Matcher classes
        String text2 = "The cat sat on the mat.";
        String pattern2 = "cat";
        Pattern p = Pattern.compile(pattern2);
        Matcher m = p.matcher(text2);
        boolean matches2 = m.find();
        System.out.println("Example 2: Pattern \"" + pattern2 + "\" matches? " + matches2);

        // Example 3: Matching a pattern with groups
        String text3 = "John Smith, 30 years old";
        String pattern3 = "(\\w+) (\\w+), (\\d+) years old";
        Pattern pattern = Pattern.compile(pattern3);
        Matcher matcher = pattern.matcher(text3);
        if (matcher.find()) {
            System.out.println("Example 3: Name: " + matcher.group(1));
            System.out.println("           Surname: " + matcher.group(2));
            System.out.println("           Age: " + matcher.group(3));
        } else {
            System.out.println("Example 3: Pattern not found.");
        }
    }
}
