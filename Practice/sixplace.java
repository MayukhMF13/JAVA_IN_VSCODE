package Practice;
public class sixplace {
    public static void main(String[] args) {
        int digit;
        int arr[] = new int [6];
        int number = 123456;
        while(number != 0)        
        {
            digit = number % 10;
            System.out.println(digit+",");
            for(int i = 1; i < 6; i++)
            {
                arr[i] = digit;
            }
            number = number / 10;            
        }
        for(int i = 1; i < 6; i++)
        {
            System.out.print(arr[i]+",");
        }
}
}