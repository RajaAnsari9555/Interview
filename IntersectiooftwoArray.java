import java.util.HashSet;

public class IntersectiooftwoArray {
    public static void Intersection(int[] arr1 , int[] arr2){
        HashSet<Integer>set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }

        for(int num : arr2){
            if(set.contains(num)){
                System.out.println(num+" ");
            set.remove(num);
            }
           
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4, 6 };
        int[] arr2 = { 1, 2, 4, 6 };
        Intersection(arr1, arr2);

    }
}
