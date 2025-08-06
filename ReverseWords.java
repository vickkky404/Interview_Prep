public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "java is easy";

        String[] words = sentence.split(" ");
        
        System.out.print("Output: ");
        for (String word : words) {
            // Reverse each word
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
