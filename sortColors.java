public class sortColors {
    public static void sortColors(int[] nums){
        int n = nums.length;
        int low =0;
        int mid = 0;
        int high = n-1;
      // case 0
        while(mid <= high){
            if(nums[mid]== 0){
                int temp = nums[low];
                nums[low]= nums[mid];
                nums[mid] = temp;
                low++;
                mid++;

            }
            //case 1
          else  if(nums[mid] ==1){
                mid++;
            }

            //case 3
            else{
                int temp = nums[high];
                nums[high]= nums[mid];
                nums[mid] = temp;
                high--;

            }

        }

    }
    public static void main(String[] args) {
        int nums[] = {2, 0, 2, 1, 1, 0};
        int n = nums.length;
        sortColors(nums);
        for(int num : nums){
            System.out.println(num);
        }
    }
}
