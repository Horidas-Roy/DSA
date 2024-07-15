package Search;


public class BinarySearch {
    public int search(int[] arr, int key){
          int low = 0;
          int high = arr.length-1;
          while (low <= high) {
             int mid = (low+high)/2;
             if (arr[mid] == key) {
                return mid;
             }
             if (key < arr[mid]) {
                high = mid -1;
             }else{
                low = mid+1;
             }
          }
          return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,3,6,8,1,9,0,3,2};
        BinarySearch bs = new BinarySearch();
        int result = bs.search(arr, 10);
        System.out.println("Search key at index: "+ result);
    }
}
