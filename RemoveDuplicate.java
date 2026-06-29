import java.util.Arrays;

public class RemoveDuplicate {
    public static int removeDuplicate(int[] nums){
      Arrays.sort(nums);
      int j =0;
      for(int i =0; i<nums.length;i++){    //!find duplicate for(i=1 to n) if(nums[i] != nums[i-1]) {Sop(nums(i))}
        if(nums[j] != nums[i]){
          j++;
          nums[j] = nums[i];
        }
      }
      return j+1;
    }
   public static void main(String[] args) {
    int[] nums = {1,2,3,5,1,3,3,2,1};
    int result = removeDuplicate(nums);
    for(int i=0; i<result; i++){
          System.out.println(nums[i]);
    }
   }
    
}
