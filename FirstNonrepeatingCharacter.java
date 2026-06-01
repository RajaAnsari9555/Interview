import java.util.HashMap;

public class FirstNonrepeatingCharacter {
    public static char nonrepeating(String s){
        HashMap<Character ,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch, 0)+1);
        }
        for(char ch:s.toCharArray()){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return '#';
    }
    public static void main(String[] args) {
        String s = "leetcode";
        char result  = nonrepeating(s);
        System.out.println(result);
    }
}
