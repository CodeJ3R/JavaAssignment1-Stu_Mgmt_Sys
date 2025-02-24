public class Student extends Person {
   private String studentID = generateStudentId();
   private String major;
   private double GPA;

private static int idCounter = 1000;
public static String generateStudentId() {
return "S" + (idCounter++);
} 

// constructor
Student(String major, String name, int age, String address){
    // super has to be the first thing in the instructor or it will ALWAYS throw errors :( *Shout out to judah for this*
    super(name, age, address);
    this.major = major;
    this.GPA = 0.0;
}
// getters

public String getStudentID() {
    return studentID;
}

public String getMajor() {
    return major;
}
public double getGPA() {
    return GPA;
}

//setters
public void setStudentID(String studentID) {this.studentID = studentID;}
public void settMajor(String major) {this.major = major;}
public void setGPA(double GPA) {this.GPA = GPA;}


@Override
public void displayDetails() {
    System.out.println("\nThis persons name is " + getName());
    System.out.println("Their age is " + getAge());
    System.out.println("Their address is " + getAddress());
    System.out.println("Their ID is " + studentID);
    System.out.println("Their Major is " + major);
    System.out.println("Their GPA is " + GPA);
    System.out.println("\n*******End of Details***********\n");
    }
}
    