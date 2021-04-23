package String;
import java.util.Scanner;
public class st5
{
    public static void main(String[] ar)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word or sentence:");
        String str=in.nextLine();
        in.close();
        str+=" ";
        String word="",lWord="";
        for (int  i=0;i<str.length();i++)
        {
            if (str.charAt(i)==' ')
            {
                if (word.length()>lWord.length())
                    lWord=word;
                word="";
            }
            else
            {
                word+=str.charAt(i);
            }
        }
        System.out.println("The longest word:"+lWord+":The length of the word:"+lWord.length());
    }
}