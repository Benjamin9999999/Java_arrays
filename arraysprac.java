import java.util.Random;
import java.util.Scanner;



public class arraysprac{
  public static void main(String[] args) {
    
   
    Scanner scanner= new Scanner(System.in);
    System.out.println("Please number of students: ");
    int numberOfStudents= scanner.nextInt();
    int [] studentMarks= new int[numberOfStudents];
    Random random = new Random();
   
    
    for( int i=0; i<numberOfStudents; i++){
      studentMarks[i] = random.nextInt(41)+60;
      System.out.println("Marks for student " +(i+1)+ " is "+ studentMarks[i]);
     
    }
    int totalSum=0;
    for(int i=0; i<numberOfStudents; i++){
       totalSum +=studentMarks[i];
       
    }
   
    double average= totalSum/numberOfStudents;
    System.out.println("The class average mark is: "+ average);
    scanner.close();
    int failThreshHold= 80;
    int numFail=0;
    for(int i=0; i<numberOfStudents; i++){
      if(studentMarks[i]<failThreshHold){
         numFail++;
      } else{
        
      }
     
      
      
      }    System.out.println("The total number of failed students is "+ numFail);
     
   }

    }
    
  
  
  
//   import java.util.Random;
// import java.util.Scanner;

// public class arraysprac {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Please enter the number of students: ");
//         int numberOfStudents = scanner.nextInt();
//         int[] studentMarks = new int[numberOfStudents];
//         Random random = new Random();

//         for (int i = 0; i < numberOfStudents; i++) {
//             studentMarks[i] = random.nextInt(41) + 60;
//             System.out.println("Marks for student " + (i + 1) + " is " + studentMarks[i]);
//         }

//         int totalSum = 0;
//         for (int i = 0; i < numberOfStudents; i++) {
//             totalSum += studentMarks[i];
//         }

//         double average = (double) totalSum / numberOfStudents;
//         System.out.println("The class average mark is: " + average);

//         // Count the number of failed students
//         int failThreshold = 40; // Adjust this threshold as needed
//         int numFailed = 0;
//         for (int i = 0; i < numberOfStudents; i++) {
//             if (studentMarks[i] < failThreshold) {
//                 numFailed++;
//             }
//         }

//         System.out.println("The total number of failed students is " + numFailed);
//         scanner.close();
//     }
// }

