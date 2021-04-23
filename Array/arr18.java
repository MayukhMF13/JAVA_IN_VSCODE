package Array;

import java.util.*;
class arr18
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int N[][] = new int[4][4];
        long evenSum = 0, oddProd = 1;
        System.out.println("Enter the elements of 4x4 DDA: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                N[i][j] = in.nextInt();
                if (N[i][j] % 2 == 0)
                    evenSum += N[i][j];
                else
                    oddProd *= N[i][j];
            }
        }
        in.close();
        System.out.println("Sum of all even numbers = " + evenSum);
        System.out.println("Product of all odd numbers = " + oddProd);
    }
}