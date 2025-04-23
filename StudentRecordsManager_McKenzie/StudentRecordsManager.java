package StudentRecordsManager_McKenzie;

import java.io.*;
import java.util.*;

/**
 * Main class that manages student records.
 * This class demonstrates file I/O and exception handling in Java.
 * 
 * The StudentRecordsManager handles:
 * - Reading student data from CSV files
 * - Processing and validating the data
 * - Calculating statistics
 * - Writing formatted results to output files
 * - Proper exception handling throughout the process
 */
public class StudentRecordsManager {
    
    /**
     * Main method to run the program.
     * Handles user input and delegates processing to other methods.
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        StudentRecordsManager manager = new StudentRecordsManager();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter input filename: ");
        String inputFile = scanner.nextLine();
        
        System.out.print("Enter output filename: ");
        String outputFile = scanner.nextLine();
        
        try {
            /**
             * TODO: Call the processStudentRecords method with appropriate parameters
             * 
             * This should pass the inputFile and outputFile variables to the method
             */
            manager.processStudentRecords(inputFile, outputFile);
        } catch (Exception e) {
            /**
             * TODO: Handle general exceptions
             * 
             * - Display a user-friendly error message
             * - Include the exception's message for debugging purposes
             * - Consider using System.err instead of System.out for error messages
             */
            System.out.println("Something went wrong... :(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(:(");
            System.out.println("Mr. Computer said: \n" + e.getMessage());
        } finally {
            /**
             * The scanner is closed in the finally block to ensure resources are
             * properly released regardless of whether an exception occurred.
             * This demonstrates proper resource management.
             */
            scanner.close();
        }
    }
    
    /**
     * Process student records from an input file and write results to an output file.
     * This method orchestrates the entire data processing workflow.
     * 
     * @param inputFile Path to the input file containing student records
     * @param outputFile Path to the output file where results will be written
     */
    public void processStudentRecords(String inputFile, String outputFile) {
        try {
            /**
             * TODO: Call readStudentRecords and writeResultsToFile methods
             * 
             * 1. Call readStudentRecords to get a list of Student objects
             * 2. Call writeResultsToFile to output the processed data
             * 3. Print a success message to the console
             */
            List<Student> students = readStudentRecords(inputFile);
            writeResultsToFile(students, outputFile);
            System.out.println("Hey, we did it!!! HOORAY!!! 😊😊😊");
        } catch (FileNotFoundException e) {
            /**
             * TODO: Handle file not found exception
             * 
             * Provide a clear message indicating which file couldn't be found
             * and possibly suggest solutions (check spelling, path, etc.)
             */
            System.out.println("Hey..... we... couldn't find your file");
            System.out.println("Double check your file name and stuff...");
            System.out.println("by.. the way.... we only take absolute path at this establishment....");
        } catch (IOException e) {
            /**
             * TODO: Handle general I/O exceptions
             * 
             * These could be permission issues, disk full, etc.
             * Provide helpful information about the nature of the I/O problem.
             */
            System.out.println("Something weird happened.....");
            System.out.println("Best you check your permissions or memory, but we don't know....");
            System.out.println("Mr. computer told me that: " + e.getMessage());
        }
    }
    
    /**
     * Read student records from a file and convert them to Student objects.
     * This method demonstrates file reading operations and exception handling.
     * 
     * @param filename Path to the input file
     * @return List of Student objects created from the file data
     * @throws IOException If an I/O error occurs during file reading
     */
    public List<Student> readStudentRecords(String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        int lineNum = 0;
        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
            while (file.ready()) {
                lineNum++;
                String line = file.readLine();
                String[] data = line.split(",");
                List<Integer> grades = new ArrayList<Integer>();
                for (int i=2; i<=5; i++) {
                    if (Integer.parseInt(data[i]) > 100.0 || Integer.parseInt(data[i]) < 0.0) {
                        throw new InvalidGradeException("Grade is out of range");
                    } else {
                        grades.add(Integer.parseInt(data[i]));
                    }
                }
                Student student = new Student(data[0], data[1], grades.toArray());
                students.add(student);
            }
        } catch (NumberFormatException e) {
            System.out.println("Item cannot be parsed as an integer. Please enter an integer");
            System.out.println("Computer says: " + e.getMessage());
        } catch (InvalidGradeException e) {
            System.out.println("Inputted grade is out of range, file line: " + lineNum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The line of the file has too few fields :(");
            System.out.println("Error at file line " + lineNum);
            System.out.println("Computer says: " + e.getMessage());
        }

        /**
         * TODO: Implement using try-with-resources to read the file
         *
         * 1. Create a BufferedReader wrapped around a FileReader
         * 2. Read each line of the file
         * 3. For each line, parse the student data:
         *    - Split the line by commas
         *    - Extract studentId (parts[0]) and name (parts[1])
         *    - Parse the four grade values (parts[2] through parts[5])
         * 4. Create a Student object with the parsed data
         * 5. Add the Student object to the students list
         *
         * Remember to handle these specific exceptions:
         * - NumberFormatException: When a grade cannot be parsed as an integer
         * - InvalidGradeException: When a grade is outside the valid range (0-100)
         * - ArrayIndexOutOfBoundsException: When a line has too few fields
         *
         * For each exception, provide clear error messages that include the line number
         * where the error occurred for easier debugging.
         */


        return students;
    }
    
    /**
     * Write processed student results to an output file.
     * This method demonstrates file writing operations.
     * 
     * @param students List of Student objects to be written to the file
     * @param filename Path to the output file
     * @throws IOException If an I/O error occurs during file writing
     */
    public void writeResultsToFile(List<Student> students, String filename) throws IOException {
        /**
         * TODO: Implement using try-with-resources to write to the file
         * 
         * 1. Create a PrintWriter wrapped around a FileWriter
         * 2. Write a header section with title and separator
         * 3. Write each student's information
         * 4. Calculate and write class statistics:
         *    - Total number of students
         *    - Class average grade
         *    - Distribution of letter grades (how many A's, B's, etc.)
         * 
         * For calculating statistics:
         * 1. Initialize counters for each letter grade (A, B, C, D, F)
         * 2. Initialize a sum for calculating the average
         * 3. Loop through all students, incrementing counters and adding to sum
         * 4. Calculate the class average and format it to 2 decimal places
         * 5. Write all statistics to the file
         * 
         * Consider using a StringBuilder for building complex strings
         * before writing them to the file.
         */
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))){
            pw.println("TITLE!!!!!! AND SEPERATOR!!!!!!\n");
            for (Student item : students){
                pw.println(item.toString());
                pw.println();
            }

            pw.println("\nCLASS STATS MOMENT YAY AI LOVA ANALYZING USELESS FICITONAL DATA YAYAYYAYAYAYYAYYYYA AAYY!Y!!!!!");
            pw.println("-----------------------------------------------------------------------------------------------");

            // Statistics calculation
            int totalStudents = students.size();
            double totalGrades = 0;
            int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

            for (Student student : students) {
                double grade = student.getAvgGrade(); // Assumes getGrade() returns a numeric grade
                totalGrades += grade;

                char letterGrade = student.getLetterGrade(); // Utility to convert numeric to letter grade
                switch (letterGrade) {
                    case 'A': countA++; break;
                    case 'B': countB++; break;
                    case 'C': countC++; break;
                    case 'D': countD++; break;
                    case 'F': countF++; break;
                }
            }

            double average = totalStudents == 0 ? 0 : totalGrades / totalStudents;
            pw.printf("Total Students: %d%n", totalStudents);
            pw.printf("Class Average: %.2f%n", average);
            pw.println("Grade Distribution:");
            pw.printf("A: %d, B: %d, C: %d, D: %d, F: %d%n", countA, countB, countC, countD, countF);
        } catch (Exception e){
            System.out.println("OMGOMGOMGOMGOMG NOOOOOO!!!! SOMETHING HAPPENED THAT I HAVE NO CLUE ABOUT GOT HELP ME NOOooOOooOoOOOoOoOOooOOO!!!!!!!!!!!!");
            System.out.println("The fREAK in the computer told me: " + e.getMessage());
        }
    }
}