public class BinarySearch {
    public static int BinarySearch(int[] arr , int target){
          int left = 0;
          int right = arr.length-1;

         

          while(left <= right){
             int mid = (left + right)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(target > mid){
              left = mid+1;
            }

            else {
                right = mid-1;
            }
          }
          return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,6,8};
        int target = 2;
        int result = BinarySearch(arr, target);
        System.out.println(result);
    }
}
