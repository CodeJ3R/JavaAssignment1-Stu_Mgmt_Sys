import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
        ArrayList<Student> Students = new ArrayList<Student>();
        int userExit = 0;
        System.out.println("\t*****************************************************************\n");
        System.out.println("\t\tWelcome to the Student Grades System V1.1 :D\n\n");
        System.out.println("\t*****************************************************************\n\n");
        System.out.println("\t\tPlease choose from one of the following FOUR options!\n");
        System.out.println("\t*****************************************************************\n");
        do {
            System.out.println("\nPress 1 to add new student");
            System.out.println("\n****************************************");
            System.out.println("\nPress 2 to display details of students");
            System.out.println("\n****************************************");
            System.out.println("\nPress 3 to Search for Student by ID");
            System.out.println("\n****************************************");
            System.out.println("\nPress 4 to exit");
            System.out.println("\n****************************************\n");
            // int chosen will be put in this variable
            int userInput = scanner.nextInt();
            // refreshes the scanner so it doesnt break
            scanner.nextLine();
            // Process User Input
            /*
             * Testing to make sure it works
             * Student test = new Student("IT", "Jeremy", 33, "123 This Street");
             */
            switch (userInput) {
                // add new student
                case 1:
                    System.out.print("Please Enter the Major: ");
                    String studentMajor = scanner.nextLine();
                    System.out.print("Please Enter the name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Please Enter the age: ");
                    int studentAge = scanner.nextInt();
                    System.out.print("Please Enter the Address: ");
                    String studentAddress = scanner.nextLine();
                    // Same as line 15, causes scanner to skip
                    scanner.nextLine();
                    // storing data in the array list
                    Students.add(new Student(studentMajor, studentName, studentAge, studentAddress));
                    System.out.println("\n******Registration Successful********\n");

                    break;
                // display student details
                case 2:
                    // for student i in students
                    // deleting for later

                    for (Student i : Students) {
                        i.displayDetails();
                    }
                    break;
                // Search By ID
                case 3:
                    System.out.print("Please enter the ID of the student: ");

                    String idLookup = scanner.nextLine();

                    for (Student i : Students) {
                        // Need this to compare strings ALWAYS use .equals when dealing with strings
                        if (i.getStudentID().equals(idLookup)) {
                            // Successfully finds the unique ID in the array list
                            System.out.println("ID Located");
                            i.displayDetails();
                            break;
                        } else {
                            // if the current student in the arraylist and they are the last one
                            // .size is a number and starts at 1, array list starts at 0. putting in -1
                            // starts it at 0
                            // shout out to judah for helping me
                            if (i == Students.get(Students.size() - 1)) {
                                System.out.println("ID not found please try again");
                            }

                        }
                    }
                    break;
                // Exit
                case 4:
                    // this is the kill switch
                    userExit = 1;
                    break;
                default:
                    System.out.println("Please enter a number between 1-4");
            }
            // This keeps working until user hits 1 to end it
        } while (userExit != 1);

        /*
         * Testing
         * Person p1 = new Person("Jeremy",33,"123 this street");
         * 
         * p1.displayDetails();
         * 
         * Student s1 = new Student("IT","Jeremy",33,"123 this street");
         * s1.displayDetails();
         */

    }
}
