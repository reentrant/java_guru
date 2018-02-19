package java_guru99;

import java.util.Random;

public class RandomNumbers{
        public static void main(String[] args) {
        	Random objGenerator = new Random();
            for (int iCount = 0; iCount< 10; iCount++){
              int randomNumber = objGenerator.nextInt(100);
              System.out.println("Random # : " + randomNumber); 
             }
            System.out.println("--- Using Math.random() -----------");
            for(int xCount = 0; xCount< 10; xCount++){
                System.out.println(Math.random());
            }
         
     }//main
}//class
