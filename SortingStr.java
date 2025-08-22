import java.util.*;

public class SortingStr {
    public static void main(String[] args) {
        String str = "ccaabbd";  

        
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        
        String sortedStr = new String(chars);

        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedStr);
    }
}
