package Practice;
import java.util.Scanner;
public class calculate {
    private int num;
    private int f;
    private int rev;

    public calculate()//parameterized constructor
    {
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        this.num = num;
        f = 0;
        rev = 0;
    }
    public int prime()// user defined method to check whether num is prime or not?
    {
        f = 1;
        if(num == 0 || num ==1)
            f=0;
            else
            for(int i = 2; i <= num; i++) 
            {
                if(num % i == 0)
                {
                f = 0;
                break;
            }
        }
        return f;
    }
    public int reverse()
    { 
        int numCopy = num;
        while(numCopy != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }
    void display() {
        if(f == 1 && rev == num)
        System.out.println(num+"is prime-palindrome");
        else
        System.out.println(num+"is not prime-palindrome");
    }
    public static void main(String[] args) {
        calculate obb = new calculate();
        obb.prime();
        obb.reverse();
        obb.display();
    }
}
