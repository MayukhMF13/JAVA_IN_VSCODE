package Practice;
import java.util.Scanner;
public class sum
{
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value in a");
        int a = in.nextInt();
        System.out.println("Enter the value in b");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b"+" "+sum);
        in.close();
    }
}