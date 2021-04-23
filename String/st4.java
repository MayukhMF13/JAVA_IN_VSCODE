package String;
import java.util.Scanner;
class st4
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a name of 3 words:");
        String name = in.nextLine();
        in.close();
        int lastSpaceIdx = name.lastIndexOf(' ');
        System.out.println(name.substring(lastSpaceIdx + 1)+" "+
                name.substring(0 , lastSpaceIdx));
    }
}