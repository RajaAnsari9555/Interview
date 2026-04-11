public class SecondLargest {
    public static int Slargest(int[] arr){
       int largest = Integer.MIN_VALUE;
       int slargest = Integer.MIN_VALUE;

       for(int i = 0 ;i<arr.length;i++){
        if(arr[i] > largest){
            slargest = largest;
            largest = arr[i];
            
        }
        else if(arr[i] > slargest && arr[i] != largest){
            slargest = arr[i];
        }
       }
       return slargest;
    }
    public static void main(String[] args) {
        int[] arr = {12,3,5,66,54};
       int result= Slargest(arr);
       System.err.println(result);
    }
}
