package java_guru99;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {
	
	private static final String fileName = "C:\\groovy-2.4.13\\bin\\HelloWorld.groovy";

	 public static void main(String[] args) {
		  BufferedReader objReader = null;
		  System.out.println(fileName.getClass());
		  try {
			   String strCurrentLine;
			   objReader = new BufferedReader(new FileReader(fileName));
			   while ((strCurrentLine = objReader.readLine()) != null) {
				   System.out.println(strCurrentLine);
			   } 		  
		  } catch (IOException e) {
			  e.printStackTrace();
		  } finally {
			   try {
				   if (objReader != null)
					   objReader.close();
			   } catch (IOException ex) {
				   ex.printStackTrace();
			   }
		  }
	 }//main
}//class

