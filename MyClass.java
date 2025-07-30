
public class MyClass {
    public static void main(String[] args) {
        
        int[] elem = {1,2,3,4,5,6};

        for(int i = 0 ; i < elem.length; i += 2){
            if(i % 2 == 0){
               System.out.print(elem[i] + " ,");
               }
        }
    }
}
