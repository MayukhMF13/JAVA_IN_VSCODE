package Practice;
public class diamond
{
    public static void main(String[] args) {
        int i,j;
        for(i = 2; i <= 6; i++)
        {
            if(i % 2 == 0)
            {
                for(j = 1; j <= 5; j++)
                {
                    int b = j%2;
                    System.out.print(b);
                }
            }
            else{
                for(j = 2; j <= 6; j++)
                {
                    int b = j%2;
                    System.out.print(b);
                }
            }
            System.out.println();
        }
    }
}