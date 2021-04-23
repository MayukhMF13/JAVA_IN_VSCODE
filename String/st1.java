package String;
import java.util.*;
class st1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str=in.nextLine();
        in.close();
        int wC=0,lC=0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==' ')
                wC++;
            else
                lC++;
        }
        wC++;
        System.out.println("No. of words="+wC);
        System.out.println("No. of letters="+lC);
    }
}