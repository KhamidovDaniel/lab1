package lab4.pkg3;

public class Lab43 {

  public static void massive(int[] mas) {
                int i,j;
                for (i=mas.length-1;i>=0;i--) {
                    boolean t=true;
                    for (j=0;j<i;j++) {
                        if (mas[j]>mas[j+1]) {
                            int temp=mas[j];
                            mas[j]=mas[j+1];
                            mas[j+1]=temp;
                            t=false;
                        }
                    }
                    if (t)
                    break;
                    //System.out.print (mas[i]+" ");
                }   
            } 
            
            
            public static void main(String[] args) {
                int[] vot={3,11,4,23,5,8,13};
                massive(vot);
                
                for (int i=0;i<=vot.length-1;i++) {
                    System.out.print (vot[i]+" ");
                }
            }
        }
