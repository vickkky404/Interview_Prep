class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        int n = 10; 
        int sum = calculateSum(n);
        System.out.println("The sum of the first" + n + "natural numbers is: " + sum);
    }

    public static int calculateSum(int n) {
        return (n * (n + 1)) / 2;
    
    }
}