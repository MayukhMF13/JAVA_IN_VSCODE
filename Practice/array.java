package Practice;

import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in=new Scanner(System.in);
        int arr[] = new int[20];
        System.out.println("Enter 20 numbers in the array:");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        in.close();
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < 20; i++) {
        sum = sum + arr[i];
        if(arr[i] > max)
        max = arr[i];
        else if(arr[i] < min)
        min = arr[i];
    }
    System.out.println("The largest number:" + max);
    System.out.println("The smallest number:" + min);
    System.out.println("Sum of all the elements of the array:" + sum);
    }
}
