import java.util.HashMap;
import java.util.Map;

public class CountFrequencyinString {
    public static String countFreq (String s){
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
                 char ch = s.charAt(i);
                 if(map.containsKey(ch)){
                    map.put(ch , map.getOrDefault(ch , 0)+1);
                 }else{
                    map.put(ch , 1);
                 }

        }
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
         System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return "#";
    }
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(countFreq(s));
    }
}
