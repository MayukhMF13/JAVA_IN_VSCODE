package Practice;
import java.util.Scanner;
public class ElectricBill {
    static String n;
    static int units;
    static double bill = 0.0d;
    void accept()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter customer's name:");
        n = in.nextLine();
        System.out.println("Enter total unit:");
        units = in.nextInt();
        in.close();
    }
    void calculate()
    {
        if(units <= 100)
        {
            bill = bill + (units*2.00);            
        }
        else if(units <= 300 && units > 100)
        {
            units = units - 100;
            bill = bill + (100*2.00)+(units*3.00);
        }
        else
        {
            bill = bill + (units * 5.00);
            bill = bill + (bill*0.25);
        }
    }
    void print()
    {
        System.out.println("Name of the customer is:"+n);
        System.out.println("total units consumd:"+units);        
        System.out.println("Total billing amount:"+bill);
    }
    public static void main(String[] args) {
        ElectricBill ob1 = new ElectricBill();
        ob1.accept();
        ob1.calculate();
        ob1.print();
    }
}
