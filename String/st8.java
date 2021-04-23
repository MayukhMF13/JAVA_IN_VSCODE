package String;
import java.util.Scanner;
public class st8
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str=in.nextLine();
        in.close();
        String word=" "+str.charAt(0);
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==' ')
                word+=str.charAt(i + 1);
        }
        System.out.println(word);
    }









}