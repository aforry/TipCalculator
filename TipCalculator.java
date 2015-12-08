import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.lang.Math;

public class TipCalculator {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		double userInput = 0;
		boolean loop = true;
		while (loop) {			
			// Prompt the user
			boolean isLegal = false;
			while(!isLegal){
				try{			
					System.out.println("Type a dollar($) amount for your bill and press 'enter':");
					userInput = scanner.nextDouble();
					isLegal = true;
				}catch (InputMismatchException exception){
					System.out.println("Not a valid ($) amount");
					isLegal = false;
					scanner.next();				
				}
			}
			// TODO: add handles for user to input their own percentage for tip			
				
			if(userInput >= 0){
				loop = false;		
			}else{
				System.out.println("Cannot be a negative value");		
			}
		}
		double outputA = userInput * 0.15;
		double outputB = userInput * 1.15;
		DecimalFormat numFormat = new DecimalFormat("#.00");
		System.out.println("You should tip $" + numFormat.format(outputA) + "\nFor a total of $" + numFormat.format(outputB));
	}
}
