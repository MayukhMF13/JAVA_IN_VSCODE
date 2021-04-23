package Practice;
import java.util.Scanner;
public class Fibonacci {
    int fib(int n)
    {
        if(n == 0)
        return 0;
        else if(n == 1)
        return 1;
        else
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Fibonacci ob2 = new Fibonacci();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = in.nextInt();
        in.close();
        System.out.println(ob2.fib(x));
    }
    
}