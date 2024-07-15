

public class LinearSearch {
     public int Search(int[] arr,int key){
           for(int i = 0; i<arr.length; i++){
                 if (arr[i] == key) {
                    return i;
                 }
           }
           return -1;
     }

     public static void main(String[] args) {
         int[] arr = {4,5,3,6,8,1,9,0,3,2};
         LinearSearch ls = new LinearSearch();
         int result = ls.Search(arr, 3);
         System.out.println("Find at index: "+result);
     }
}
