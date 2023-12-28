/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		//// Write your code here
		int first = (int)(Math.random() * 10);
	System.out.println(first);
	int next = (int)(Math.random() * 10);
	
	if (next >= first) {
	 do {
	 System.out.println (next);
	 first = next;
	 next = (int)(Math.random() * 10);
	  }
	 while (next >= first);
	 }
	}
}
