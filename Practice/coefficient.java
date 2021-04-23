package Practice;
import java.util.Scanner;
public class coefficient
{
    public static String giveSign(double number)
    {
       if(number >= 0)
           return ("+" + number);
       else
           return ("" + number);
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the co-efficient of x^2:");
        int a = in.nextInt();
        System.out.println("Enter the co-efficient of x:");
        int b = in.nextInt();
        System.out.println("Enter the value of the constant:");
        int c = in.nextInt();
        in.close();

        System.out.println("Entered equation is:");
        System.out.print(giveSign((int)a)+"x^2");
        System.out.print(giveSign((int)b)+"x");
        System.out.print(giveSign((int)c));
        System.out.println();

        // calculate the determinant (b2 - 4ac)
        double determinant = b * b - 4 * a * c;

        // check if determinant is greater than 0
        if (determinant > 0)
        {
            // two real and distinct roots
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.print("="+" ");
            System.out.print("(x"+giveSign(0-(int)root1)+")"+"(x"+giveSign(0-(int)root2)+")");
        }

        // check if determinant is equal to 0
        else if (determinant == 0) {

            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            double root1 = -b / (2 * a);
            double root2 = -b / (2 * a);
            System.out.print("="+" ");
            System.out.print("(x"+giveSign(0-root1)+")"+"(x"+giveSign(0-(int)root2)+")");
        }

    }
}