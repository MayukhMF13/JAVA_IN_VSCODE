import java.util.*;
class newnumberformprimedigits
{
    public static void main()
    {
        int n,d,nl=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=in.nextInt();
        in.close();
        while(n!=0)
        {
            d=n%10;
            if(d%2!=0)
            {
                nl=nl*10+d;
            }
                n=n/10;
        }
            System.out.println("The New No. is"+nl);
    }
}