import mystudents.Student;

public class App {
    public static void main(String [] args) {

        Student myStudent = new Student();
        myStudent.firstName = "Kairi";
        myStudent.lastName = "Her";
        myStudent.major = "Web_Development";
        myStudent.gpa = 2.478;
        myStudent.age= 19;
        myStudent.onProbation = true;

        Student myStudent2 = new Student();
        myStudent.firstName = "Josh";
        myStudent.lastName = "Hosh";
        myStudent.major = "Math";
        myStudent.gpa = 3.5;
        myStudent.age= 23;
        myStudent.onProbation = false;
    }
}