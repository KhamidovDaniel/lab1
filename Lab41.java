package lab4.pkg1;
import java.util.Random;
public class Lab41 {

     public static void main(String[] args) {
        int[] arr = new int[20];
        int a = 5;
        int b = 18;
        
        for(int i=0; i<arr.length; ++i){
            arr[i] = generateRandom(a, b);
            System.out.print(arr[i]+"  ");
        }
    }
    
    public static int generateRandom(int a, int b){
        return (a + new Random().nextInt(b-a+1));
    }
}
