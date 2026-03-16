public class Missing {
    public static int findM(int[] arr ){
      int n = arr.length+1;
      int expectedSum = n*(n+1)/2;
      int sum =0;

      for(int i =0; i<arr.length ; i++){
        sum = sum + arr[i];
      }
      return expectedSum-sum;
    }
    public static void main(String[] args) {
       int[] arr = {1,2,4,5};
       int result = findM(arr);
       System.out.println(result);
    }
}
