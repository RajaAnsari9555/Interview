public class MergeSortTwo {

    public static int[] merge(int[] arr1 , int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n+m];
        int i =0; int j =0; int k =0;

        //!sort all arrays and both
        while(i<n && j<m){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                k++;
                i++;
            }
            else{
                result[k] = arr2[j];
                k++;
                j++;
            }
        }
        //! remaining element of arr1
        while(i<n){
            result[k] = arr1[i];
            k++;
             i++;
        }
        //! remaining element of j
        while( j<m){
            result[k] = arr2[j];
            k++;
            j++;
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