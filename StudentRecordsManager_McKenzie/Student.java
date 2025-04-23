package StudentRecordsManager_McKenzie;

import java.util.Arrays;

/**
 * Class representing a student record with grades.
 * This class demonstrates basic OOP principles and data encapsulation.
 */
public class Student {
    // TODO: Add private fields for studentId, name, grades array, averageGrade, and letterGrade
    private String studentID;
    private String name;
    private Object[] grades;
    private double avgGrade;
    private char letterGrade;

    /**
     * Constructor to initialize a Student object
     * @param studentId The student's ID
     * @param name The student's name
     * @param grades Array of the student's grades
     */
    public Student(String studentId, String name, Object[] grades) {
        // TODO: Initialize fields and calculate average and letter grade
        this.studentID = studentId;
        this.name = name;
        this.grades = grades;
        this.avgGrade = calculateAverage(grades);
        this.letterGrade = determineLetterGrade(this.avgGrade);
    }
    
    /**
     * Calculates the average of all grades
     * @return The average grade as a double
     */
    private double calculateAverage(Object[] grades) {
        // TODO: Calculate and return the average of all grades
        double avg = 0;
        for (Object num : grades){
            avg += (int)num;
        }
        avg /= grades.length;
        return avg;
    }
    
    /**
     * Determines the letter grade based on the average
     * @return A character representing the letter grade (A, B, C, D, or F)
     */
    private char determineLetterGrade(double avg) {
        // TODO: Return letter grade based on the following scale:
        //       A: 90-100
        //       B: 80-89
        //       C: 70-79
        //       D: 60-69
        //       F: 0-59
        if (avg >= 90.0) return 'A';
        if (avg >= 80.0) return 'B';
        if (avg >= 70.0) return 'C';
        if (avg >= 60.0) return 'D';
        return 'F';
    }
    
    // TODO: Implement getters for all fields
    // Hint: Follow standard Java naming conventions for getters (getXxx method names)
    public String getStudentID(){
        return this.studentID;
    }
    public String getName(){
        return this.name;
    }
    public Object[] getGrades(){
        return this.grades;
    }
    public double getAvgGrade(){
        return this.avgGrade;
    }
    public char getLetterGrade(){
        return this.letterGrade;
    }


    /**
     * Returns a string representation of the student
     * @return String containing all student information
     */
    @Override
    public String toString() {
        // TODO: Return a string representation of the student including:
        //       - ID, name, all grades, average (formatted to 2 decimal places), and letter grade
        // Hint: Use StringBuilder to efficiently build the string as shown in the slides
        // Hint: Use String.format("%.2f", averageGrade) to format the average to 2 decimal places
        StringBuilder output = new StringBuilder("ID: " + this.studentID + "\nName: " + this.name + "\nGrades: " + Arrays.toString(this.grades) + "\nAverage: ");
        output.append(String.format("%.2f", this.avgGrade));
        output.append("\nLetterGrade: " + this.letterGrade);
        return output.toString();
    }
}









