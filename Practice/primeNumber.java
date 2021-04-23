package Practice;
public class primeNumber
{
    public static void main(String[] args) 
    {
        for(int i = 1 ; i <= 15;)
        {
            int c=0;
            for(int j1 = 1 ; ; j1++)
            {
                for(int j2 = 1; j2 <= j1; j2++)
                {
                    if(j1 % j2 == 0)
                    c = c+1;
                }
                if(c == 2)
                {
                    System.out.println(j1);
                }
            }
        }
    }
}