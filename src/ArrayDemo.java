import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArrayDemo {
	
	

	public static void main(String[] args) {
//		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
//		
//		cars[0] = "Mustang";
//		
//		System.out.println(cars[3]);
		
//		String[] cars = new String[3];
//		
//		cars[0] = "Camaro";
//		cars[1] = "Corvette";
//		cars[2] = "Tesla";
//		
//		System.out.println(cars[0]);
		
		String[][] cars = {
				{"Camaro", "Corvette", "Tesla", "BMW"},
				{"Mustang", "Ranger", "F-150"},
				{"Ferrari", "Lambo", "Telsa"}
		};
		for (int i = 0; i < cars.length; i++) {
			System.out.println();
			for(int j = 0; j < cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
			}
		}
	}
	
	
} 