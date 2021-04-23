package Array;

import java.util.*;
class arr13
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a[] = new double[10];
        int b[] = new int[10];        
        System.out.println("Enter 10 decimal numbers");
        for (int i=0;i<a.length;i++) 
        {
            a[i] = in.nextDouble();
            in.close();
            b[i] = (int)a[i];
        }        
        System.out.println("Truncated numbers");
        for (int j=0;j<b.length;j++) 
        {
            System.out.print(b[j] + ", ");
        }
    }
}