
public class JavaLectures1 {
	public static void main(String[] args) {
		/* This is 
		 * 
		 multiline comment*/
		//Java Naming Convention - On test
		//Class names should begin with a capital letter
		//Constants, should be all capital --> PI
		//methods, packages, variables, and almost anything else in Java
		//should be in lower case
		//When you are stringing words together to name something
		//such as the file name for this class, use CamelCase
		//example variable --> firstName
		//example class --> MyFirstClass
		//example constant --> SALESTAX
		
		/* 8 Primitive Types
		 * byte, short, int, long
		 *  */
		byte myByte = 127; //this variable is intialized
		//-8 to 127
		short myShort = 32000;
		int myInt = 1000;
		long myLong = 1000000;
		byte myByte2; //this is declared, but not intialized
		myByte = myByte; //it was not intialized 
		myByte2 = 120; //it is now reassigned 
		
		/* 2 decimal types of primitives: float and double */
		float myFloat = 1.0f;
		double myDouble = 2.3;
		
		/* non-numerical primitives */
		//boolean takes one of two values, either true or false
		boolean myBoolean = true;
		boolean myBoolean2 = false;
		
		//char is exactly one character 
		char myChar = 'a';
		
		//print what we have
		System.out.println("This prints on one line then goes to next");
		System.out.print("This prints on one line than stays here");
		System.out.print("Yeet");
		System.out.println("My character is" + myChar);
		System.out.println("My int is" + myInt);
		
		//String --> sequence of characters (or they can also be a single character)
		String myString = "Patel";
		System.out.println("My string is" + myString);
		
		String myString2 = "Patel String";
		System.out.println(myString + myString2);
		System.out.println("My String is" + myString);
		System.out.println("This was my first string " + myString + " and this was my second: " + myString2);
		
		int x = 10;
		int y = 11;
		System.out.println("the sum of x and y is: " + (x + y));
		System.out.println(myString.charAt(1)); //call the charAt method on myString
		//Overloading a method 
		System.out.println(myString.substring(1));//call the substring method on myString 
		
		//Constants
		final double TAXRATE = 6.25;
		//TAXRATE = 10; // Cannot reassign a constant
		
		
		//Arrays
		int [] intsA = {1,2};
		int [] intsB = new int[2];
		
		System.out.println(intsB[0]);
		System.out.println(intsB[1]);
		System.out.println(intsA[0]);
		System.out.println(intsA[1]);
		
		//Is it possible to { Ctrl + Alt + Delete } all the bitches I know       
		
	}//end of the main method
}//end of JavaLectures1 class
