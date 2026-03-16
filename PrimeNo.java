import java.util.Scanner;

public class PrimeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number");

        int n = sc.nextInt();
        Boolean isPrime= true;

        if(n<=1){
          isPrime = false;
        }

        for(int i =2; i<=n/2 ; i++){
            if(n%i == 0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime?"Prime":"not Prime");
    }
}