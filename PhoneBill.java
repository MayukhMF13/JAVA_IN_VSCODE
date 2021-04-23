import java.util.Scanner;
public class PhoneBill {
    String customerName;
    long phoneNumber;
    int no_of_units;
    int rent;
    float amount;

    void calculate()
    {
        float cost;
        if(no_of_units<=50)
        cost=0;
        else if(no_of_units<=150)
        cost=50*0+(no_of_units)*0.80f;
        else if(no_of_units<=200)
        cost=50*0+100*0.80f+(no_of_units-150)*1.00f;
        else
        cost=50*0+100*0.80f+200*1.00f+(no_of_units-350)*1.20f;
        amount = rent + cost;        
    }

    PhoneBill()
    {
        customerName = "Raju";
        phoneNumber = 259461;
        no_of_units = 50;
        rent = 100;
        amount = 100;        
    }

    void accept(){
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the Customer name:");
         customerName = in.nextLine();
         System.out.println("Enter the Phone Number:");
         phoneNumber = in.nextLong();
         System.out.println("Enter number of units consumed:");
         no_of_units = in.nextInt();
         System.out.println("Enter rent: ");
         rent = in.nextInt();
         in.close();
         calculate();
    }

    void display()
    {
        System.out.println("Customer Name:"+customerName);
        System.out.println("Phone Number:"+phoneNumber);
        System.out.println("Number of units consumed:"+no_of_units);
        System.out.println("Rent:"+rent);
        System.out.println("Amount:"+amount);
    }

    public static void main(String[] args) {
        PhoneBill obj = new PhoneBill();
        obj.calculate();
        obj.accept();
        obj.display();
    }    
}