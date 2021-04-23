package Practice;
public class power 
{
    public void pow(double a, long b)
    { 
        double r = 1;
        if(a >= 0 && b == 0) // checking whether the power is 0 or not
        {
            r = 1;
        }
        else if(a == 0 && b >= 1) // checking whether the base is zero or not
        {
            r = 0;
        }
        else
        {
            for(int i = 1; i <= b; i++)
            {
                r = r * a;
            }
        }
        System.out.println(a+"^"+b+"="+r); // printing the value of a^b
    }
    public static void main(String[] args) // main function
    {
        power obb = new power(); // making the object power() in the place name obb
        obb.pow(5,2); // calling the user defined method pow
    }
}