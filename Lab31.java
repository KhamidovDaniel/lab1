package lab3.pkg1;

public class Lab31 {

    public static void main(String[] args) {
        int[] a = new int[10];
        int i = 0;
        int b = 2;
        while (i < 10) {
            a[i] = b;
            b += 2;
            i++;
        }        
        //вывод в строку
        for (i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
        //Вывод в столбик
        System.out.println();
        for (i = 0; i < 10; i++)
            System.out.println(a[i]);
    }
    
}
