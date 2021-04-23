package Array;

import java.util.Scanner;
class arr1
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[20];
        System.out.println("Enter 20 numbers:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int oddSum=0,evensum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            evensum+=arr[i];
            else
            oddSum+=arr[i];
        }
        System.out.println("Sum of the odd numbers="+oddSum);
        System.out.println("Sum of Even numbers="+evensum);
        in.close();
    }
}