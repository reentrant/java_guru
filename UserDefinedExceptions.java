package java_guru99;

public class UserDefinedExceptions {
	public static void main(String args[]){
		  try{
		       throw new MyException(2);
		       // throw is used to create a new exception and throw it.
		  }
		  catch(MyException e){
		    System.out.println(e) ;
		  }//catch
	}//main
}//class

class MyException extends Exception{
	   
	int a;
	   
	   MyException(int b) {
	     a=b;
	   }
	  
	   public String toString(){
	     return ("Exception Number =  " + a) ;
	   }
}
