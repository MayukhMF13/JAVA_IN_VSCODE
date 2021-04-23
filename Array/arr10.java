package Array;

import java.util.*;
class arr10
{
    public static void main(String[] args)
    {
        int NUM_COUNT=20;
        Scanner in = new Scanner(System.in);
        int i=0;        
        int arr[]=new int[NUM_COUNT];
        int even[]=new int[NUM_COUNT];
        int odd[]=new int[NUM_COUNT];        
        System.out.println("Enter 20 numbers:");
        for (i=0;i<NUM_COUNT;i++) 
        {
            arr[i]=in.nextInt();
            in.close();   
        }     
        int eIdx=0,oIdx=0;
        for (i=0;i<NUM_COUNT;i++) 
        {
            if (arr[i]%2==0)
                even[eIdx++]=arr[i];
            else
                odd[oIdx++]=arr[i];
        }        
        System.out.println("Even Numbers:");
        for (i=0;i<eIdx;i++) 
        {
            System.out.print(even[i]+" ");
        }        
        System.out.println("\nOdd Numbers:");
        for (i=0;i<oIdx;i++) 
        {
            System.out.print(odd[i]+ " ");
        }
    }
}