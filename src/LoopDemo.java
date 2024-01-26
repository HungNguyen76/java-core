import java.util.Scanner;
import javax.swing.JOptionPane;

public class LoopDemo {
	
	

	public static void main(String[] args) {
		//while loop = executes a block of code as long as a it's condition remains true
		 
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
//		while(name.isBlank()) {
//			System.out.println("Enter your name: ");
//			name = scanner.nextLine();
//		}
//		do {
//			System.out.println("Enter your name: ");
//			name = scanner.nextLine();
//		}while (name.isBlank());
//		
//		System.out.println("Hello " +name);
		
		//Nested Loop
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter a rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter a columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i = 1; i <= rows; i++) {
			System.out.println();
			for (int j=1; j<= columns; j++) {
				System.out.print(symbol); 
			}
		}

	}
	
}