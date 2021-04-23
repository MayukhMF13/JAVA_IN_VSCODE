package String;
import java.util.Scanner;
public class st9
{
    public static void main(String[] ar)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();// Take a sentence as a input
        in.close();
        str = str + " ";//Attach a space at the last of the sentence
        String word = "";
        for (int i = 0; i < str.length(); i ++)
        {
            if (str.charAt(i) == ' ')
            {
                int len = word.length();
                boolean isPalin = true;
                for (int j = 0; j < len/2; j ++)
                {
                    if (word.charAt(j) != word.charAt(len-1-j))
                    {
                        isPalin = false;
                        break;
                    }
                }
                if (isPalin)
                    System.out.println(word);
                word = "";
            }
            else
            {
                word += str.charAt(i);
            }
        }
    }
}