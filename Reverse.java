/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
   String str = args[0];
   String s = "" ;
   int n = str.length() ;
   
   for (int i = n-1; i >= 0; i--){
        s+= str.charAt(i);
	}
	
	System.out.println (s);
	System.out.println ("The middle character is " + s.charAt(n/2));
	}
}
