package Array;
import java.util.*;
class arr21
{
    public void maintainRecords()
    {
        final int TOTAL_STUDENTS = 40;
        final int TOTAL_SUBJECTS = 5;
        final String SUBJECT_NAMES[] = {"English", "Hindi",
                "Maths", "Science", "Computer Science"};
        Scanner in = new Scanner(System.in);
        String names[] = new String[TOTAL_STUDENTS];
        int marks[][] = new int[TOTAL_STUDENTS][TOTAL_SUBJECTS];
        int i = 0, j = 0;

        for (i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println("Student " + (i + 1) + " details:");
            System.out.print("Name: ");
            names[i] = in.nextLine();
            for (j = 0; j < TOTAL_SUBJECTS; j++) {
                System.out.print("Enter marks in " +
                        SUBJECT_NAMES[j] + ": ");
                marks[i][j] = in.nextInt();
            }
            in.nextLine();
            in.close();
        }
        System.out.print("\nEnter name of the student to search: ");
        String studentName = in.nextLine();
        for (i = 0; i < TOTAL_STUDENTS; i++) {
            if (names[i].equals(studentName))
                break;
        }

        if (i == TOTAL_STUDENTS) {
            System.out.println("Record for " + studentName
                    + " not found");
        }
        else {
            System.out.println("Name: " + names[i]);
            int total = 0;
            for (j = 0; j < TOTAL_SUBJECTS; j++) {
                System.out.println("Marks in " +
                        SUBJECT_NAMES[j] + ": " + marks[i][j]);
                total += marks[i][j];
            }
            System.out.println("Total Marks: " + total);
        }
    }
    public static void main(String[] args)
    {
        arr21 obb=new arr21();
        obb.maintainRecords();
    }
}