package exercise;

import java.util.Calendar; 

public class SubstingExercise {

	public static void main(String[] args) {

//  String currentTime = Calendar.getInstance().getTime().toString();
    String currentTime = "Tue Jun 25 20:45:36 EDT 2019";
    System.out.println(currentTime);
    
//  String substring1 = currentTime.substring(11,19);
//  String substring2 = currentTime.substring(24,28);
//  System.out.println("The current time is " + substring1 + " and the current year is " + substring2 + ".");
    
    int indexOfyear = currentTime.length()-4; // last four characters.
    String year = currentTime.substring(indexOfyear);
    System.out.println(year);
    
    int indexOfSpace = currentTime.indexOf(' ');
    int indexOf2ndSpace = currentTime.indexOf(' ', indexOfSpace+1 );
    int indexOf3rdSpace = currentTime.indexOf(' ', indexOf2ndSpace+1 );
    int indexOf4thSpace = currentTime.indexOf(' ', indexOf3rdSpace+1 );
    
    String time = currentTime.substring(indexOf3rdSpace+1, indexOf4thSpace );
    System.out.println("The current time is " + time + " and the current year is " + year + ".");
    
    
    
     
    

	}

}
