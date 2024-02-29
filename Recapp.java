import java.util.Scanner;

public class Recapp {
  public static void main(String[] args) {
    myStudent();

    
  }
    
}
  
  static void myStudent(){
    Scanner myScanner = new Scanner(System.in);
   
    System.out.println("Enter the number of students");
    int numStudents= myScanner.nextInt();
    Student[] mystudents= new Student[numStudents];
   
    
    for(int i=0; i<numStudents;i++){
    System.out.println("Enter your First Name:");
    String firstName=myScanner.nextLine();
    System.out.println("Enter your LastName");
    String lastName= myScanner.nextLine();
    System.out.println("Enter your Age");
    int age= myScanner.nextInt();
    System.out.println("Enter the Stream of your class");
    String classStream=myScanner.nextLine();
    System.out.println("Enter your Date of birth");
    int dateBirth= myScanner.nextInt();
    System.out.println("Enter your admission number: ");
    int admissionNumber= myScanner.nextInt();
    mystudents[i]=new Student(firstName,lastName,age,classStream,dateBirth,admissionNumber);
    
    }
    for(int i=0; i<numStudents;i++){
      System.out.println(mystudents[i]);
    }

  }
  static class Student{
    String firstName;
    String lastName;
    int age;
    String classStream;
    int admissionNumber;
    int dateBirth;
    // constructors
  public Student(String firstName, String lastName,int age,String classStream,int admissionNumber,int dateBirth){
    this.admissionNumber=admissionNumber;
    this.age=age;
    this.firstName=firstName;
    this.lastName=lastName;
    this.classStream=classStream;
    this.dateBirth=dateBirth;}
  public String toString(){
    return "First Name: " + firstName+ " Last Name: " +lastName+ "Age: "+age+
     "Class Stream: "+classStream+"Admission Number: " +admissionNumber+"Date of Birth: "+dateBirth;
  }

  }

