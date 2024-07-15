public class SelectionSort {
    public void sort(int[] arr){
          int n = arr.length;
          for(int i = 0; i<n-1; i++){ //i<n-1 because last element is already sorted
              int min = i;
              for(int j = i+1; j<n; j++){
                  if (arr[j] < arr[min]) {
                      min = j;
                  }
              }
              int temp = arr[min];
              arr[min] = arr[i];
              arr[i] = temp;
          }
    }
    public void print(int[] arr){
        for(int value : arr){
            System.out.print(value+"-->");
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        int[] arr = {4,5,3,6,8,1,9,0,3,2};
        SelectionSort ss = new SelectionSort();
        ss.print(arr);
        ss.sort(arr);
        ss.print(arr);

    }
}
