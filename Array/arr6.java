package Array;

import java.util.*;
class arr6
{
    public static void main()
    { 
        int TOTAL_STUDENTS=50;
        Scanner in=new Scanner(System.in);        
        String name[]=new String[TOTAL_STUDENTS];
        int marks[]=new int[TOTAL_STUDENTS];
        int total=0;        
        for (int i=0;i<name.length;i++)
        {
            System.out.print("Enter name of student"+(i+1)+":");
            name[i]=in.nextLine();
            System.out.print("Enter marks of student"+(i+1)+":");
            marks[i]=in.nextInt();
            total+=marks[i];
            in.nextLine();
        }        
        double avg=(double)total/TOTAL_STUDENTS;
        System.out.println("Subject Average Marks="+avg);
        int hIdx = 0;        
        for (int i=1;i<marks.length;i++) 
        {
            if (marks[i]>marks[hIdx])
                hIdx=i;
        }        
        System.out.println("Highest Marks="+marks[hIdx]);
        System.out.println("Name="+name[hIdx]);
        in.close();
    }
}