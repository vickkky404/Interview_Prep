//Sometimes, the normal if-else isn't enough. In such cases, we have what we call ladder if and else conditions.  So here we'll learn to use them.

//Given a positive integer n. Your task is to check if it is divisible as given below:
//1. If it is divisible by 2, print "Two".
//2. If it is divisible by 3, print "Three".
//3. If it is divisible by 11, print "Eleven".
//4. If not following the above three rules, print "-1".
//Note: If n is divisible by more than one of the above-given numbers, print the largest one.

class Geeks {
    static void isDivisibleByPrime(int n) {
        // Your code here
        
        if(n % 11 == 0){
            System.out.println("Eleven");
        }else if (n % 3 == 0){
            System.out.println("Three");
        }else if (n %  2 == 0){
            System.out.println("Two");
        }else{
            System.out.println("-1");
        }
        
        
    }
}

