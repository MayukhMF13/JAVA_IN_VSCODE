package String;

import java.util.*;
class st2
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word or sentence:");
        String str=in.nextLine();
        in.close();
        char newStrArr[]=new char[str.length()];
        String t=str.toUpperCase();
        int idx=0;
        for (int i=0;i< t.length();i++)
        {
            if (t.charAt(i)=='A'||t.charAt(i)=='E'||t.charAt(i)=='I'||t.charAt(i)=='O'||t.charAt(i)=='U')
                continue;
            newStrArr[idx++]=str.charAt(i);
        }
        String newStr=new String(newStrArr);
        System.out.println("String with vowels removed");
        System.out.println(newStr);
    }
}
