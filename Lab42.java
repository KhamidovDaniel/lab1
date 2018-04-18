package lab4.pkg2;


public class Lab42 {

   
    //Создадим метод, который будет возвращать случайное целое число из отрезка a-b, которые будт его параметрами

    public static int randomTest(int a,int b){
        if(a>b){
            int c=(int)(Math.random()*(a-b+1))+b;
            return c;
        }
        else {
            int c=(int)(Math.random()*(b-a+1))+a;
            return c;
        }
    }
    //Создадим метод, который будет возвращать заполненный массив
    public static int [] zapolnenieMassiva(int [] a){
        //Определим случайные значения, в рамках которых будут находится значения элементов массива
        int z = (int)(Math.random()*100);
        int x = (int)(Math.random()*100);
        for(int i=0;i<a.length;i++){
            a[i]=randomTest(z, x);
            }
        return a;
    }
    //Функция выводящая на экран элементы массива в строку, после выведения последнего элемента строка переносится 
    public static void printTest(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if(i==a.length-1)
                System.out.println("");
        }
    }
    public static void main(String[] args){
        //Создаем массив, заполняем и выводим на экра при помощи прописанных методов. И так 5 раз.
        int[] Mas1=new int[10];
        zapolnenieMassiva(Mas1);
        printTest(Mas1);
        
        int[] Mas2=new int[10];
        zapolnenieMassiva(Mas2);
        printTest(Mas2);
        
        int[] Mas3=new int[10];
        zapolnenieMassiva(Mas3);
        printTest(Mas3);
        
        int[] Mas4=new int[10];
        zapolnenieMassiva(Mas4);
        printTest(Mas4);
         
        int[] Mas5=new int[10];
        zapolnenieMassiva(Mas5);
        printTest(Mas5);
        
     }
}       