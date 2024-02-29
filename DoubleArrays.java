import java.util.Scanner;

public class DoubleArrays{
  
 
  static void mapStudents(){
 
  
 Scanner scanner= new Scanner(System.in);
 System.out.println("Please Enter the number of students: ");
 int numStudents=scanner.nextInt();
 Student [] students= new Student[numStudents];

 System.out.println("We are about to collect students details for the above "+ numStudents+ " number of students");
//  Loop to collect details

  for(int i=0;i<numStudents;i++) {
    System.out.println("Enter name");
    String name= scanner.next();
    System.out.println("Enter marks");
    int marks= scanner.nextInt();
    students[i]= new Student(marks, name);
  }
  // Display info for each student
  for(int i=0; i<numStudents; i++){
    System.out.println(students[i]);
  }
scanner.close();

 

}

 
  public static void main (String [] args){
    
    mapStudents();
   
   

   
    
  }

  static class Student {
    private int marks;
    private String name;
    public Student(int marks, String name){
      this.marks= marks;
      this.name= name;
    }
    @Override
    public String toString(){
      return "Name: " + name+ " Marks: " +marks;
    }
  }
}
