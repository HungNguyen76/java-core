import java.util.Scanner;
import javax.swing.JOptionPane;

public class IfElseDemo {
	

	public static void main(String[] args) {
		
		//if statement	= performs a block of code if it's condition evaluates to be true
		int age = 20;
		if(age >= 18) {
			System.out.println("You are adult!");
		} else if(age >= 75) {
			System.out.println("Ok Boomer!");
		} else {
			System.out.println("You are not an adult!");
		}
	}
	
}