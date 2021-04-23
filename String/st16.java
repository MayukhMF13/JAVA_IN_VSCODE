package String;
import java.util.Scanner;
public class st16
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        in.close();
        str = str.toUpperCase();
        int freqMap[] = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                int chIdx = ch - 65;
                freqMap[chIdx]++;
            }
        }
        
        System.out.println("Character\tFrequency");
        for (int i = 0; i < freqMap.length; i++) {
            if (freqMap[i] > 0) {
                System.out.println((char)(i + 65) 
                            + "\t\t" + freqMap[i]);
            }
        }
    }
}