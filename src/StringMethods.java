import java.util.Scanner;
import javax.swing.JOptionPane;

public class StringMethods {
	
	

	public static void main(String[] args) {
		String name = "Bro";
		
//		boolean result = name.equalsIgnoreCase("ro");
//		int result = name.length();
//		char result = name.charAt(0);
//		int result = name.indexOf("o");
//		boolean result = name.isEmpty();
//		String result = name.toLowerCase();
//		String result = name.toUpperCase();
//		String result = name.trim();
		String result = name.replace('o', 'a');
		
		System.out.println(result);
		
		
	}
	
}