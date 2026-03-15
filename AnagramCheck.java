//! two string anagram if the char of one string is same as char of second String
//! String s1 = "listen";
    //!    String s2 = "silent";


    //? step 
    // 1.check length of s1 not eqaul to s2 return false
    // 2.convert char into array;
    // 3. sort the both char;
    // 4.compare both String;

import java.util.Arrays;

public class AnagramCheck {
//!using frquency character

    
    public static boolean Anagram(String s1, String s2){
          if(s1.length() != s2.length()){
                return false;
          }

          char[] a=s1.toCharArray();
          char[] b = s2.toCharArray();

          Arrays.sort(a);
          Arrays.sort(b);

          return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        String s1 =  "listen";
         String s2 = "silent";
         if(Anagram(s1, s2)){
            System.out.println("anagram ");
         }else{
            System.out.println("not anagram");
         }
    }
}

//! using character frequency

