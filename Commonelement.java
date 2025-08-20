public class Commonelement {
    public static void main(String[] args) {
        int [] a = {1,2,6,7,8};
        int[] b = {2,6,9,8,7,7};
        System.out.println("common elementp");
        for(int i = 0; i<a.length;i++){
            for(int j = 0; j < b.length;j++){
                if (a[i]==b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}