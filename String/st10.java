package String;
import java.util.Scanner;
public class st10
{
    public static void main(String[] ar)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        in.close();
        str = " " + str;
        String word = "";
        for (int i=str.length()-1;i>=0;i--)
        {
            if (str.charAt(i)==' ')
            {
                System.out.print(word + " ");
                word = "";
            }
            else
            {
                word=str.charAt(i)+ word;
            }
        }
    }
}