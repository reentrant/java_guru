package java_guru99;

public class Sample_String {
	public static void main(String[] args){
		//String Concatenation
		String str1 = "Rock";
		String str2 = "Star";
		//Method 1 : Using concat
		String str3 = str1.concat(str2);
		System.out.println(str3);
		//Method 2 : Using "+" operator
		String str4 = str1 + str2;
		System.out.println(str4);
		
		
		
		String str_Sample = "RockStar";
		  //Length of a String
		  System.out.println("Length of String: " + str_Sample.length());
		  System.out.println("Character at position 5: " + str_Sample.charAt(5));
		//Index of a given character
		System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
		
		//Compare to a String
		System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("ROCKSTAR"));
		  //Compare to - Ignore case
		  System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
		
		//Check if String contains a sequence
		  System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));
		  
		//Check if ends with a particular sequence
		  System.out.println("EndsWith characters 'ar': " + str_Sample.endsWith("ar"));
		  
		//Replace Rock with the word Duke
		  System.out.println("Replace 'Rock' with 'Duke': " + str_Sample.replace("Rock", "Duke"));
		  
		//Convert to LowerCase
		  System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
		//Convert to UpperCase
		System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());
//		str_Sample[0] = 'P';
		
		System.out.println("Testing inmutability: " + str_Sample.getClass());
		//declare the String as an object S1 S2
        String S1 = "Hello Java String Method";
        String S2 = "RockStar";

        //length() method of String returns the length of a String S1.
        int length = S1.length();
        System.out.println("Length of a String is: " + length);
        //8 Length of a String RockStar
        System.out.println("Length of a String is: " + S2.length());
        str_Sample = "This is Index of Example";
        //Character at position
        System.out.println("Index of character 'x': " + str_Sample.indexOf('x'));
        //Character at position after given index value
        System.out.println("Index of character 's' after 3 index: " + str_Sample.indexOf('s', 4));
        //Give index position for the given substring
        System.out.println("Index of substring 'is': " + str_Sample.indexOf("is"));
        //Give index position for the given substring and start index
        System.out.println("Index of substring 'is' form index:" + str_Sample.indexOf("is", 3));
        
        
        try {
        	String s1 = "This is String CharAt Method";
	        //returns the char value at the 0 index
	        System.out.println("Character at 0 position is: " + s1.charAt(0));
	        //returns the char value at the 5th index
	        System.out.println("Character at 5th position is: " + s1.charAt(5));
	        //returns the char value at the 22nd index
	        System.out.println("Character at 22nd position is: " + s1.charAt(22));
	        //returns the char value at the 23th index
	        char result = s1.charAt(-1);
	        System.out.println("Character at 23th position is: " + result);
        }
        catch (StringIndexOutOfBoundsException e) {
        	
            System.out.println("Compare To 'a' b is : " + "a".compareTo("b"));
            
            System.out.println("Compare To 'b' a is : " + "b".compareTo("a"));
            str_Sample = "b";
            System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
        }
        String s1 = "Guru1";
        String s2 = "Guru2";
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        // Compare the two strings.  
        int S = s1.compareTo(s2);

        // Show the results of the comparison.  
        if (S < 0) { System.out.println("\"" + s1 + "\"" + " is lexicographically higher than " + "\"" + s2 + "\"");
        } else if (S == 0) {
            System.out.println("\"" + s1 + "\"" + " is lexicographically  equal to " + "\"" + s2 + "\"");
        } else if (S > 0) {
            System.out.println("\"" + s1 + "\"" + " is lexicographically less than " + "\"" + s2 + "\"");
        }
        
		}
}
