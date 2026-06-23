import java.util.Arrays;

public class Rearrange_Array_elementsbySign {

    public static int[] RearrangeArray(int[] nums) {
        int posIndex = 0;
        int negIndex = 1;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                result[negIndex] = nums[i];
                negIndex += 2;
            } else {
                result[posIndex] = nums[i];
                posIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};

        System.out.println(Arrays.toString(RearrangeArray(nums)));
    }
}