import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.lang.Math;

public class TipCalculator {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		double userInputA = 0;
		double userInputB = 0;
		boolean loop = true;
		while (loop) {			
			// Prompt the user
			boolean isLegal = false;
			while(!isLegal){
				try{			
					System.out.println("Type a dollar($) amount for your bill and press 'enter':");
					userInputA = scanner.nextDouble();
					isLegal = true;
				}catch (InputMismatchException exception){
					System.out.println("Not a valid ($) amount");
					isLegal = false;
					scanner.next();				
				}
			}			
			if(userInputA >= 0){
				loop = false;		
			}else{
				System.out.println("Cannot be a negative value");		
			}
		}
		loop = true;
		while (loop) {			
			// Prompt the user
			boolean isLegal = false;
			while(!isLegal){
				try{			
					System.out.println("Type a percentage(%) to tip and press 'enter':");
					userInputB = scanner.nextDouble();
					isLegal = true;
				}catch (InputMismatchException exception){
					System.out.println("Not a valid (%) amount");
					isLegal = false;
					scanner.next();				
				}
			}			
			if(userInputB >= 0){
				loop = false;		
			}else{
				System.out.println("Cannot be a negative value");		
			}
		}
		double outputA = userInputA;
		double outputB = userInputB;
		double outputC = userInputA * (userInputB/100);
		double outputD = userInputA * (1 + (userInputB/100));
		DecimalFormat numFormat = new DecimalFormat("#.00");
		System.out.println("Your bill was $" + numFormat.format(outputA) + " with a " + numFormat.format(outputB) + "% tip\n" + "You should tip $" + numFormat.format(outputC) + "\nFor a total of $" + numFormat.format(outputD));
	}
}
