package Array;

import java.util.*;
class arr4
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[20];        
        System.out.println("Enter 20 numbers");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = in.nextInt();
        }        
        System.out.println("Prime Numbers:");
        for (int i = 0; i < arr.length; i++) 
        {            
            if (arr[i] == 1)
                continue;               
            boolean isPrime=true;
            for (int j = 2; j <= arr[i] / 2; j++) 
            {
                if (arr[i] % j == 0) 
                {
                    isPrime = false;
                    break;
                }  
            }            
            if (isPrime)
                    System.out.print(arr[i]+",");
        }
        in.close();
    }
}