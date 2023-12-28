/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
   int number = Integer.parseInt (args[0]);
   String answer = (number + " is a perfect number since " + number + " = 1");
   int add = 1;
   
   for (int i = 2; i < number; i++){
     if (number % i == 0) {
	     add+= i;
		 answer+= " + " + i;
	 }
   }
	if (add == number){
	  System.out.println (answer);
	 }
	 else {
	  System.out.println (number + " is not a perfect number");
	 }
	}
}
