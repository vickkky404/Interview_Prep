import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        boolean result = isIsomorphic(s, t);
        System.out.println(result);  
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> hm = new HashMap<>();
        HashSet<Character> mappedValues = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (hm.containsKey(charS)) {
                
                if (hm.get(charS) != charT) {
                    return false;
                }
            } else {
                
                if (mappedValues.contains(charT)) {
                    return false;
                }

                hm.put(charS, charT);
                mappedValues.add(charT);
            }
        }

        return true;
    }
}
