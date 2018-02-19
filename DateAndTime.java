package java_guru99;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

class CalculateAge {
	Date dob;
	Date now;
	
	CalculateAge(String DOB)
	{
		try{
			this.now = new Date();
			this.dob = new SimpleDateFormat("dd-MM-yyyy").parse(DOB);
			
		}
		catch (Throwable e) {
			System.out.println(e);
		}
		
	}//constructor
	
	 public void calculate() throws ParseException {

	  
	  if (dob.compareTo(now) > 0) {
	   System.out.println("Date 1 occurs after Date 2");
	  } // compareTo method returns the value greater than 0 if this Date is after the Date argument.
	  else if (dob.compareTo(now) < 0) {
	   System.out.println("Date 1 occurs before Date 2");
	  } // compareTo method returns the value less than 0 if this Date is before the Date argument;
	  else if (dob.compareTo(now) == 0) {
	   System.out.println("dob are same dates");
	  } // compareTo method returns the value 0 if the argument Date is equal to the second Date;
	  else {
	   System.out.println("You seem to be a time traveller !!");
	  }
	 }//main
	}//class



public class DateAndTime {

	public static void main(String[] args) {
	  // Instantiate a Date object by invoking its constructor
	  Date today = new Date();
	  // Display the Date & Time using toString()
	  System.out.println(today.toString());
	  
	  String strDateFormat = "hh:mm:ss a dd-MMM-yyyy"; //Date format is Specified
	  SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
	  System.out.println(objSDF.format(today)); //Date formatting is applied to the current date

	  CalculateAge dateCalculator = new CalculateAge("25-09-1976");
	  try {
		dateCalculator.calculate();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	}

}
