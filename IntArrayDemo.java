package java_guru99;

public class IntArrayDemo {
	
	
	public static void passByReference(int a[]){
	     a[0] = 5;
	   }

	public static void main(String args[]){
		int array[] = new int[7]; 
		try {
	        System.out.println("Fill the array");
	        for (int count=0; count<7; count++){
	        	
	           array[count] = count+1;
	       }
	        
		       System.out.println("Before Function Call    ");
		       System.out.println("Display the array");
	       for (int count=0; count<7; count++){
	           System.out.println("array["+ count +"] = "+ array[count]);
	       }

	       IntArrayDemo.passByReference(array);
	       System.out.println("After Function Call    ");
	       System.out.println("Display the array");
	       for (int count=0; count<7; count++){
	           System.out.println("array["+ count +"] = "+ array[count]);
	       }
	       array[8] =10;
		}
		 catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println("Length of Array  =  " + array.length); 
			 
		 }
		
		// Not using counters:
		for (int iElement : array){
			System.out.print(iElement);
			System.out.print(' ');
		}
		
		
      }
}
