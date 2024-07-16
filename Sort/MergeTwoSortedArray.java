package Sort;
public class MergeTwoSortedArray {
      public int[] merge(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n+m];
        int i = 0; //travers arr1
        int j = 0; //travers arr2
        int k = 0; //travers result

        while ( i < n && j < m) { //boundary conditions
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];//sorting arr1 element into result
                i++;
            }else{
                result[k] = arr2[j];//sorting arr2 element into result
                j++;
            }
            k++;
        }
        //either arr1 or arr2 got exhausted 
        while (i < n) { //arr2 got exhausted
             result[k] = arr1[i];//sorting arr1 element into result
             i++;
             k++;
        }
        while (j < m) {  //arr1 got exhausted
            result[k] = arr2[j]; //sorting arr2 element into result
            j++;
            k++;
        }
        return result;
      }

//display
public void display(int[] arr){
      for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" ");
      }
      System.out.println("");
}

public static void main(String[] args) {
      int[] arr1 = {2,3,5,10,30};
      int[] arr2 = {4,6,11,15};

      MergeTwoSortedArray ms = new MergeTwoSortedArray();
      int[] result = ms.merge(arr1, arr2);
      ms.display(result);

}

}
