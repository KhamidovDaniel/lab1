package lab2.pkg6;

public class Lab26 {

   
    public static int min(int a, int b, int c, int d)
{
   int m2=min(a, b);
   if (m2<=c & m2<=d) return m2;
   if (c<=m2 & c<=d) return c;
   if (d<=c & d<=m2) return d;
   return m2;
}
public static int min(int a, int b)
{
    int m1;
    if (a<b) m1=a;
    else m1=b;
    return m1;
    
}
}
