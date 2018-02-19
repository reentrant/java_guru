package java_guru99;

class DemoChild extends Constructors{
    int value3;
    int value4;
    
    DemoChild(){
	     super(5);
		 value3 = 3;
		 value4 = 4;
		 System.out.println("Inside the Constructor of Child");
    }
    
    public void display(){
      System.out.println("Value1 === " + value1);
      System.out.println("Value2 === " + value2);
      System.out.println("Value1 === " + value3);
      System.out.println("Value2 === " + value4);
   }
}

public class Constructors {

    int  value1;
    int  value2;
    
    Constructors(){
       value1 = 10;
       value2 = 20;
       System.out.println("Inside Constructor");
    }
    
    Constructors(int a){
        value1 = a;
        System.out.println("Inside 2nd Constructor");
      }
      Constructors(int a, int b){
      value1 = a;
      value2 = b;
      System.out.println("Inside 3rd Constructor");
     }

   public void display(){
      System.out.println("Value1 === " + value1);
      System.out.println("Value2 === " + value2);
   }

	 public static void main(String args[]){
	     Constructors d1 = new Constructors();
	    d1.display();
	    new Constructors(30).display();
	    new Constructors(40, 50).display();
	    DemoChild constructorChaining = new DemoChild();
	    constructorChaining.display();
	}

}
