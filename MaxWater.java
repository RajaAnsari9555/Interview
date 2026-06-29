public class MaxWater {
    public static int maxWater(int[] arr){
        int l = 0;
        int n = arr.length;
        int r = n-1;
        int maxArea = 0;
        while(l < r){
            int h = Math.min(arr[l], arr[r]);
            int w = r-l;
            int area = h * r;

            maxArea = Math.max(maxArea, area);
            if(arr[l] <= arr[r]){
                l++;
            }
            else{
                r--;
            }
        }
        
return maxArea;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int result = maxWater(nums);
        System.out.println(result);
    }
}
