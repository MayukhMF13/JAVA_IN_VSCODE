package String;
import java.util.*;
class st7
{
    public static void main(String[] ar)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string in uppercase:");
        String str=in.nextLine();
        in.close();
        char newStrArr[]=new char[str.length()];
        String t=str.toUpperCase();
        int idx=0;
        for (int i=0;i<t.length();i++)
        {
            if (t.charAt(i)=='A'||t.charAt(i) == 'E' ||t.charAt(i) == 'I' ||t.charAt(i) == 'O' ||t.charAt(i) == 'U')
            {
                newStrArr[idx++]='*';
            }
            else
            {
                newStrArr[idx++]=str.charAt(i);
            }
        }
        String newStr = new String(newStrArr);
        System.out.println(newStr);
    }
}