import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        String result = removeDuplicates(str);

        System.out.println("Original String: " + str);
        System.out.println("Removed Dupliacate: " + result);

        sc.close();

        }

        public static String  removeDuplicates(String str){
            StringBuilder sb = new StringBuilder();
            Set<Character> seen = new HashSet<>();

            
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                sb.append(ch);
            }
        }

        return sb.toString(); 

 
    }
}
