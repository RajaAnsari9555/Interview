//! if sum of all divisor of a number is eqaul to that number except that number  i.e called perfect number

public class PerfectNumber {
    public static boolean perfect(int n) {
         int sum =0;

         for(int i =1; i<n/2; i++){
            if(n %i == 0){
                sum = sum +i;
            }
         
         }

         return sum == n;
    }
    public static void main(String[] args) {
         int n = 28;
         System.out.println(perfect(n) ? "perfect number" :"not perfect number");
    }
}
