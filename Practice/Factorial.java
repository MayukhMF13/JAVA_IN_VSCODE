package Practice;
import java.util.Scanner;
public class Factorial
{
    int fact (int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Factorial ob1 = new Factorial();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        in.close();
        System.out.println("Factorial:"+" "+ob1.fact(n));
    }
}