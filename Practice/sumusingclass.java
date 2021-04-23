package Practice;

import java.util.*;
public class sumusingclass
{
    public void sum(int n1,int n2)
    {
    int sum = n1+n2;
    System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = in.nextInt();
        System.out.println("Enter the second number:");
        int b = in.nextInt();
        in.close();
        sumusingclass obj = new sumusingclass();
        obj.sum(a,b);
    }
}