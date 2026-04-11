public class Armstrong {
    public static void main(String[] args) {
        int n = 123;
        int original =n;
        int sum =0;

        while(n > 0){
            int ld = n% 10;
             sum  = sum + (ld*ld*ld);
             n = n/10;
        }
        System.out.println((sum == original) ? " Armstrong Number" :"Not Armstrong");
    }
}
