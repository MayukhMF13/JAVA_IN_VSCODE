import java.util.Scanner;
public class Compound
{
    double pamt;
    double rate;
    int time;

    public Compound()
    {
        pamt = rate = time = 0;
    }

    private void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Principal:");
        pamt = in.nextDouble();
        System.out.println("Enter the rate:");
        rate = in.nextDouble();
        System.out.println("Enter the Time:");
        time = in.nextInt();
        in.close();
    }

    double findInterest()
    {
        double cl;
        cl = pamt + Math.pow(1+rate/100, time) - pamt;
        return cl;
    }

    void printData()
    {
        System.out.println("Principal:" + pamt);
        System.out.println("Rate:" + rate);
        System.out.println("Time:" + time);
    }

    public static void main(String[] args) {
        Compound ob = new Compound();
        ob.input();
        ob.printData();
        System.out.println("Compound Interest = " + ob.findInterest());
    }
}