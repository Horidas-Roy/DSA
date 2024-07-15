package Sort;
public class InsertionSort {
    public void sort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
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
        InsertionSort iSort = new InsertionSort();
        iSort.print(arr);
        iSort.sort(arr);
        iSort.print(arr);
    }
}
