public class BubbleSort {
    public static void BubbleSort(int[] arr){
        int n = arr.length;
        for( int i =0; i<arr.length ; i++){
            for(int j =0; j<n-1-i; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr =  {2,4,4,3,1,4};
        BubbleSort(arr);
        for(int num : arr){
            System.out.println(num);
        }
    }
}
