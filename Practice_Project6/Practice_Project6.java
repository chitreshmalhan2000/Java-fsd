package Practice_Project6;
import java.util.*;
public class Practice_Project6 {
    public static void main(String[] args) {
//Map = sorted map->(TreeMap) + HashMap->(LinkedHashMap) + Hashtable.
    //Map<String, Integer> ageMap = new TreeMap<>();
   	//Map<String, Integer> ageMap = new LinkedHashMap<>();
   	//Map<String, Integer> ageMap = new Hashtable<>();
    Map<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);
        
        System.out.println("HashMap elements:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        ageMap.remove("Bob"); // Removing an element from the HashMap

        System.out.println("\nHashMap after removing an element:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        boolean containsKey = ageMap.containsKey("Alice");
        System.out.println("\nHashMap contains key 'Alice'? " + containsKey);

        boolean containsValue = ageMap.containsValue(35);
        System.out.println("HashMap contains value 35? " + containsValue);
        
        int size = ageMap.size();
        System.out.println("Size of HashMap: " + size);

        ageMap.clear();

        boolean isEmpty = ageMap.isEmpty();
        System.out.println("\nIs HashMap empty? " + isEmpty);
    }
}
