package String;
import java.util.Scanner;
public class st13 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a word: ");
        in.close();
        String str = in.nextLine().toLowerCase();
        char newStr[] = new char[str.length()];
        for(int i = 0; i < str.length(); i++)
        {
        if( str.charAt(i) == 'a' ||
            str.charAt(i) == 'e' ||
            str.charAt(i) == 'i' ||
            str.charAt(i) == 'o' ||
            str.charAt(i) == 'u') {
                newStr[i] = (char)(str.charAt(i) + 1);
            }
            else{
                newStr[i] = str.charAt(i);
            } 
        }
        String replacedStr = new String(newStr);
        System.out.println(replacedStr);
    }
}