package Array;

import java.util.*;
class arr11
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[20];        
        System.out.println("Enter 20 numbers");
        for (int i=0;i<arr.length;i++) 
        {
            arr[i] = in.nextInt();
        } 
        in.close();       
        System.out.println("Perfect Squares are:");
        for (int i=0;i<arr.length;i++) 
        {
            double sr=Math.sqrt(arr[i]);
            if ((sr-Math.floor(sr))==0)
                System.out.print(arr[i]+",");
        }
    }
}