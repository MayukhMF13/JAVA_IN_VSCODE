package Practice;
import java.util.Scanner;
public class Number
{
    public void number()
    {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter 1 to display number in binary equivalent:");
    System.out.println("Enter 2 to display number in desimal equivalent:");
    System.out.println("Enter your choice:");
    int ch = in.nextInt();
    switch (ch)
    {
        case 1 :
        System.out.println("Enter a decimal number:");
        int number = in.nextInt();
        System.out.println("Binary Equivalent:");
        System.out.println(Integer.toBinaryString(number));
        break;
        case 2 :
        System.out.println("Enter a binary number");
        String bin = in.nextLine();
        System.out.println("Decimal Equivalent");
        System.out.println(Integer.parseInt(bin, 2));
        in.close();
        break;
        default:
    }
}
    public static void main(String[] args) {
        Number obb = new Number();
        obb.number();
    }
}