import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("/n");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        System.out.println("Enter the scores for each subject:");
        float totalScore = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the score for subject " + i + ": ");
            float score = scanner.nextFloat();
            totalScore += score;
        }
        
        float averageScore = totalScore / numSubjects;
        
        char grade;
        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
