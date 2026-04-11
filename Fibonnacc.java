public class Fibonnacc {
    public static int fibonnacci(int n ){
          //! using recursion
    //! base condition
    if(n==0){
        return 0;
    }
    if(n==1){
        return  1;
    }

    return fibonnacci(n-1) + fibonnacci(n-2);
}

    public static void main(String[] args) {
        int n = 7;

        for(int i = 0; i < n; i++){
            System.out.print(fibonnacci(i) + " ");
    }
}
}
