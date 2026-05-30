public class MaximumSubarray {
    public static int maxisubarray(int[] num){
             int max = Integer.MIN_VALUE;
             int sum =0;
             for(int i =0; i<num.length;i++){
                sum += num[i];
                    if(sum > max){
                        max = sum;
                    
                    }
                    else if(sum < 0){
                        sum = 0;
                    }
             }
                return max;
             }
    
    

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxisubarray(nums);
        System.out.println(result);
    }
}
