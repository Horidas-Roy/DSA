public class BubbleSort {
    public void sort(int[] arr){
          boolean isSwaped;
          for(int i = 0; i<arr.length - 1; i++){
              isSwaped = false;
              for(int j = 0; j<arr.length-1-i; j++){
                  if (arr[j] > arr[j+1]) {
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     isSwaped = true;
                  }
              }
              if (isSwaped == false) {
                  break;
              }
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
        BubbleSort bsort = new BubbleSort();
        bsort.print(arr);
        bsort.sort(arr);
        bsort.print(arr);
    }
}
