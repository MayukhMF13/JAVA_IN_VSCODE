import java.util.Scanner;
public class piglatin {    
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Word: ");
        String word = in.nextLine();
        in.close();
        int length = word.length();

        word = word.toUpperCase();
        String piglatin = "";
        int flag = 0;

        for(int i = 0; i < length; i++)
        {
            char x = word.charAt(i);
            if(x == 'A' ||
               x == 'E' || 
               x == 'I' ||
               x == 'O' ||
               x == 'U')
               {
                   piglatin = word.substring(i) +  
                                word.substring(0, i) + "AY" ;                                                     
                   flag = 1;
                   break;             
               }
            }

            if(flag == 0)
            {
                piglatin = word + "AY";
            }        
            System.out.println(word + " in Piglatin form is " + piglatin);
        }
    }