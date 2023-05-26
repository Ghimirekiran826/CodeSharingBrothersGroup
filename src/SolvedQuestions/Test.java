package SolvedQuestions;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        // Accept student information
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Section: ");
        String section = sc.nextLine();

        // Accept marks for three subjects
        int[] marks = new int[3];
        String[] subjects = {"Java", "Python", "Larabel"};

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + " : ");
            marks[i] = sc.nextInt();
        }

        // Calculate totalmarks and average marks
        int totalMarks = 0; //setting default value to 0
//        for (int mark : marks) {
//            totalMarks += mark;
//        }
        for(int i=0;i<marks.length;i++)
        {
        	totalMarks += marks[i];
        }
        double averageMarks = (double) totalMarks / marks.length;

        // Determine result
        String result = averageMarks >= 40 ? "Pass" : "Fail";

        // Display student information, total marks, average marks, and result
        System.out.println("\nStudent Information");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Section: " + section);
        System.out.println();
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Result: " + result);
        }
        catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        finally {
        	System.gc();
        }
    }
}
