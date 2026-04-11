public class Countvowels {
    public static void countVowels(String s){
          int vowels = 0;
          int constant = 0;
          for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <='z'){
                if(ch == 'a'|| ch =='e' || ch =='i'|| ch =='o'|| ch=='u'){
                    vowels++;
                }
                else{
                    constant++;
                }
            }
          }
          System.out.println(vowels);
          System.out.println(constant);
          }
         
   
    public static void main(String[] args) {
        String s= "Hello Md Raja";
        countVowels(s);
       
    }
}
