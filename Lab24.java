package lab2.pkg4;
import java.io.BufferedReader; import java.io.InputStreamReader;
public class Lab24 {

    public static void main(String[] args) throws Exception
{
    int i=0;
    while (i<4){
        i++;
    String a,b;
    int cA,dB;
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("введите a и b, ");
    a=r.readLine();
    b=r.readLine();
    cA = Integer.parseInt(a);
    dB = Integer.parseInt(b);
    if (cA > dB){
        System.out.println("минимум =  "+dB);
    }
    else if (cA < dB) {
        System.out.println("минимум =  "+cA);
    }
    else {
        System.out.println("минимум =  " +cA);
    }
   }
  }   
}
