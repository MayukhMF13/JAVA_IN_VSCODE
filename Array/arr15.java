package Array;

import java.util.*;
class arr15
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);        
        int P[]=new int[6];
        int Q[]=new int[4];
        int R[]=new int[10];
        int i=0;        
        System.out.println("Enter 6 elements of array P:");
        for (i=0;i<P.length;i++) 
        {
            P[i]=in.nextInt();
            in.close();
        }        
        System.out.println("Enter 4 elements of array Q:");
        for (i=0;i<Q.length;i++) 
        {
            Q[i]=in.nextInt();
            in.close();
        }        
        i=0;
        while(i<P.length) 
        {
            R[i]=P[i];
            i++;
        }        
        int j=0;
        while(j<Q.length) 
        {
            R[i++]=Q[j++];
        }        
        System.out.println("Elements of Array R:");
        for (i=0;i<R.length;i++) 
        {
            System.out.print(R[i]+" ");
        }
    }
}