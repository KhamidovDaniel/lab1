package lab3.pkg2;

public class Lab32 {
    public static void main(String[] args) {
        //В переменной а будет храниться значение размера массива, которое мы получим с помощью простого цикла
        int a=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0)a++;
        }
        //Создадим массив, и используя цикл, заполним его ячейки. Сразу выведем на экран значения элементов массива в строку
        int[] Mas = new int[a];
        for(int i=1,b=0;i<=99;i++){
                if(i%2!=0){
                    Mas[b]=i;
                    System.out.print(Mas[b]+" ");
                    b++;
                }
        }
        //Выведем на экран каждый элемент массива на отдельной строке в обратном порядке
        System.out.println(" ");
        for(int i=Mas.length-1;i>=0;i--){
            System.out.println(Mas[i]);
    }
    
}
