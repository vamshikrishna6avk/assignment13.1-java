package inttostring;//created package as inttostring
/**
 * Here we are converting an int variable to String using an inbuilt function toString().
 *
 */
public class XYZ {//created class as XYZ
                 //classes are the basics of oops(object orinented programming)
	private static String String;//private cam accessible only within class

	public static void main(String[] args) {//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		int a = 1;    // assigning value  
            
		String num =String.valueOf(a);       // making a string object num and converting an int variable into string 
		
		System.out.println(" Int variable converted to string:" + num);     //prints the string value

		
	}

}