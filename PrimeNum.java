public class PrimeNum {

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2 ; i <=Math.sqrt(num) ; i++){
            if(num % i == 0 ){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        boolean first = true;

        for(int num: arr){
            if(isPrime(num)){
                if(first){
                    System.out.print(num);
                    first = false;
                } else {
                    System.out.print(" , " + num);
                }
            }
        }
    }
}
