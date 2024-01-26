import java.util.Scanner;
import javax.swing.JOptionPane;

public class LogicalOperators {
	
	

	public static void main(String[] args) {
		//logical operators = ussed to connect two or more expressions
		//						&& = (AND) both conditions must be true
		//						|| = (OR) either conditions must be true
		//						! = (NOT) reverses boolean value of condition
		
//		int temp = 25;
//		if(temp >30) {
//			System.out.println("It is hot outside");
//		} else if(temp >= 20 && temp <= 30) {
//			System.out.println("It is warm outside");
//		}
//		
		//OR
		Scanner scanner = new Scanner(System.in);
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		} else {
			System.out.println("You still playing the game *pew pew*");
		}
	}
	
}