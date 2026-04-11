public class MergeSortTwo {

    public static int[] merge(int[] arr1 , int[] arr2){
       int n = arr1.length;
       int m = arr2.length;
       int[] result = new int[n+m];
       int i =0; int j = 0; int k =0;
         while(i<n && j<n){
            if(arr1[i] < arr2[j]){
               result[k] = arr1[i];
               
               i++;
            }

            else{
                result[k] = arr2[j];
                j++;
            }
            k++;
         }

        while(i<n){
            result[k] = arr1[i];
            i++;
            k++;
         }

         while(i<m){
            result[k] = arr2[j];
            j++;
            k++;
         }
         return result;
    } 
    public static void main(String[] args) {
        int[] arr1= {1,2,2,3,4};
        int[] arr2 ={2,3 ,4,5,6};
        int[] merge = merge(arr1, arr2);
        for(int num : merge){
            System.out.println(num +" ");
        }
    }
}