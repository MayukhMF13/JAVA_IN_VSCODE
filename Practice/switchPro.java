package Practice;
 import java.util.Scanner;
 public class switchPro
 {
     public static void main(String[] args)
     {
         Scanner in = new Scanner(System.in);
         System.out.println("1, x^1 + x^2 + x^3 + x^4 + .... + x^20");
         System.out.println("2, 1 11 111 1111 11111");
         System.out.println("Enter your choice:");
         int ch = in.nextInt();
         in.close();
         switch(ch)
         {
         case 1:
         {
             int i, x = 2, sum = 0; // the value of "x" is given is the question as 2

            for(i = 1; i <= 20; i++)
            {
                if(i % 2 == 0)                
                    sum = sum + (int) Math.pow(x,i);                
                else
                    sum = sum - (int) Math.pow(x,i);                
            }
        }
        break;

        case 2:
        {
            int sum = 0;
            for(int i = 0; i <= 4; i++) {
                sum = sum * 10 + 1;
                System.out.print(sum+" ");
            }
        }
        break;

        default:
        System.out.println("Wrong Choice!!");
         }
     }
 }