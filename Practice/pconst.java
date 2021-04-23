package Practice;
import java.util.Scanner;
public class pconst {
    // class using parameterized constructor
    int a,b;
    pconst()//parameterized constructor
    {   Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = in.nextInt();
        System.out.println("Enter the value of b");
        int b = in.nextInt();
        in.close();
        this.a = a;
        this.b = b;
    }
    void display()
    {
        System.out.println("The value of a is"+" "+a+" "+"and the values of b is"+" "+b);
    }
    public static void main(String[] args) {
        pconst ob1 = new pconst();
        ob1.display();
    }
}
