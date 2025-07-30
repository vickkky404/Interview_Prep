import java.util.Scanner;

public class Rwv{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of character: ");
        int size = sc.nextInt();
        
        char[] charArr = new char[size];

        System.out.print("Enter " + size + "Characyers");
        for(int i = 0 ; i < size ; i++){
            charArr[i] = sc.next().charAt(0);
        }

        System.out.print("Reverse Order:");
        for(int i = 0 ; i <charArr.length ; i++){
            System.out.println(charArr[i] + " ");
        }

        System.out.println();

        System.out.print("Reverse Order:");
        for(int i = charArr.length -1 ; i >=0; i--){
            System.out.print(charArr[i] + " ");
        }

        System.out.println();

        sc.close();

    }
} 