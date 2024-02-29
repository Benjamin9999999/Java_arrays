import java.util.HashMap;
import java.util.Scanner;

public class DataTypes {

public static void main(String[] args) {
 HashMap<String, String>capitalCities = new HashMap<String, String>();
 String capitalCity;
 String myCountry;
 Scanner myScanner= new Scanner(System.in);
 System.out.println(" Please Enter the name of the country: ");
 myCountry=myScanner.nextLine();
 System.out.println("Please Enter the Capital City of "+myCountry);
 capitalCity= myScanner.nextLine();
 capitalCities.put(myCountry,capitalCity );
 capitalCities.put("Uganda", "Kigali");
 capitalCities.put("Tanzania", "Arusha");
 capitalCities.put("Rwanda", "Kigali");

 String myCity=capitalCities.get("Kenya");
 System.out.println("The capital City of " +myCountry+ "    is " +myCity);
 myScanner.close();
for(String i: capitalCities.keySet()){
  System.out.println(i+" "+capitalCities.get(i));
}
 


  
}
  
}
