//! Sum of all divisors (except itself) = the number

public class PerfectNumber {
    public static boolean perfect(int n) {
         int sum =0;
         int original = n;

         for(int i =1 ; i<n/2 ; i++){
            if(n %i == 0){
                sum += i;
            }
         }
         return sum == original;
    }
    public static void main(String[] args) {
         int n = 28;
         System.out.println(perfect(n) ? "perfect number" :"not perfect number");
    }
}
