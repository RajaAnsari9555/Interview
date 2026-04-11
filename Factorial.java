public class Factorial {
    public static int fibonnaci(int n){
        if(n ==0 || n==1){
            return 1;
        }
        
        return n*fibonnaci(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        int result = fibonnaci(n);
        System.out.println(result);
    }
}
