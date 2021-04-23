package String;
import java.util.Scanner;
public class st6
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=in.nextLine();
        in.close();
        for (int i=0;i<word.length();i++)
        {
            System.out.println("ASCII of"+word.charAt(i)+"="+(int)word.charAt(i));
        }
    }
}