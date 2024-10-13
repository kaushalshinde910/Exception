 package exception;

public class GradeException extends Exception {
    public GradeException(String message) {
        super(message);
    }
}

class StudentGradingSystem {
    private int totalGrades;
    private int totalSum;
    private int[] grades; // Initialize grades array

    public StudentGradingSystem() {
        totalGrades = 0;
        totalSum = 0;
        grades = new int[100]; // Initialize grades array with size 100
    }

    public void addGrade(int grade) throws GradeException {
        if (grade < 0 || grade > 100) {
            throw new GradeException("Grade must be between 0 and 100");
        }
        grades[totalGrades] = grade; // Add grade to grades array
        totalGrades++;
        totalSum += grade;
    }

    public double calculateAverage() throws GradeException {
        if (totalGrades == 0) {
            throw new GradeException("Grade list is empty");
        }
        return (double) totalSum / totalGrades;
    }

    public void removeGrade(int index) throws GradeException {
        if (index < 0 || index >= totalGrades) {
            throw new GradeException("Invalid index");
        }
        int grade = grades[index];
        totalSum -= grade;
        totalGrades--;
        // Shift grades to the left to remove the grade at the specified index
        for (int i = index; i < totalGrades; i++) {
            grades[i] = grades[i + 1];
        }
    }


public class main
{ 
    public static void main(String[] args) {
        StudentGradingSystem sgs = new StudentGradingSystem();
        try {
            sgs.addGrade(90);
            sgs.addGrade(80);
            sgs.addGrade(70);
            sgs.addGrade(60);
            sgs.addGrade(50);
            sgs.addGrade(40);
            sgs.addGrade(30);
            sgs.addGrade(20);
            sgs.addGrade(10);
            sgs.addGrade(0);
            // sgs.addGrade(-10); // This will throw an InvalidGradeException
        } catch (GradeException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Average: " + sgs.calculateAverage());
        } catch (GradeException e) {
            System.out.println(e.getMessage());
        }
        try {
            sgs.removeGrade(5);
            // sgs.removeGrade(10); // This will throw an InvalidGradeException
        } catch (GradeException e) {
            System.out.println(e.getMessage());
        }
    }
}
}
