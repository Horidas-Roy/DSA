package singlyLinkedList;
public class movesZero{

    public void printArray(int[] arr){
        for (int item : arr) {
            System.out.print(item);
        }
        System.out.println();
    }
	
	public void movesZeroInArray(int[] arr) {
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0 && arr[j] == 0 ) {
				int temp = arr[i];
				    arr[i]=arr[j];
				    arr[j] = temp;
			}
			if(arr[j] != 0) {
				j++;
			}
		}
	}

    public static void main(String[] args) {
         int[] number = {0,5,6,3,4,0,5,0,3,9};
         movesZero mZero = new movesZero();

         mZero.printArray(number);
         mZero.movesZeroInArray(number);
         mZero.printArray(number);

         
    }
}
