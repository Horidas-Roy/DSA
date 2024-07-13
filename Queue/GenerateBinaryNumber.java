package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumber {
    public String[] generateBinaryNumber1ToN(int n){
         String[] result = new String[n];
         Queue<String> q = new LinkedList<>();
         q.offer("1");
         for(int i = 0; i<n; i++){
             result[i] = q.poll();
             String n1 = result[i]+"0";
             String n2 = result[i]+"1";
             q.offer(n1);
             q.offer(n2);
         }
         return result;
    }

    public void disply(String[] arr){
         for(String str : arr){
             System.out.print(str+"-->");
         }
         System.out.println("end");
    }

    public static void main(String[] args) {
        GenerateBinaryNumber gBinery = new GenerateBinaryNumber();
        String[] bineryArray = gBinery.generateBinaryNumber1ToN(100);
        gBinery.disply(bineryArray);
    }
}
