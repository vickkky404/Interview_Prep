package STRING;
public class Vowel {
    public static void main(String[] args) {
        char[] word = {'R', 'A', 'V', 'A', 'N', 'A'};

        System.out.print("Vowels in the word: ");
        for (char c : word) {
            char lowerChar = Character.toLowerCase(c);
            
            if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || 
                lowerChar == 'o' || lowerChar == 'u') {
                System.out.print(c + " ");
            }
        }
    }
}
