/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
	for (int row = 1; row <= n; row ++){
	
	if (row % 2 == 1){
	for (int j = 0; j < n; j++){
		System.out.print ("* ");
	}
	System.out.println();
	}
	
	if (row % 2 == 0){
	for (int j = 0; j< n; j++){
		System.out.print (" *");
	}
   System.out.println();
 }
}
 }
}
