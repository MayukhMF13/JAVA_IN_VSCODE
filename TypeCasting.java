class TypeCasting 
{ 
    public static void main(String[] args) 
    { 
        int i = 100;  
		long l = 200;
          
		// Explicit type casting from int to char
        char ch = (char)i;
		
		// Explicit type casting from long to int
		i = (int)l;
		
        System.out.println("value "+ ch); 
		System.out.println("value "+ i); 
        
    } 
}