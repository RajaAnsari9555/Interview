import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber(int[] nums){
       HashMap<Integer ,Integer> map = new HashMap<>();
       for(int num : nums){
        map.put(num , map.getOrDefault(num , 0)+1);
       }
       for(Map.Entry<Integer , Integer> entry: map.entrySet()){
         if(entry.getValue() == 1){
            return entry.getKey();
         }
       }
       return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 2, 4,5,5,6,6,7,7};
        int result = singleNumber(nums);
        System.out.println(result);
    }

}
