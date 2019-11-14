package TNBnotes;
import java.util.Scanner;

public class buildingABasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//line with with Strings "System.out.println" to go to the next line
		//with "nextDouble()" you are doing the same thing but with numbers 
		//"Double" is a type of number
		
		//1. first thing we did wa write variable for our Scanner "Scanner Cesar = new Scanner(System.in);"
		//2. Next made 3 Variables that where DOUBLE which means numbers "double fnum, snum, answer;"
		//3. Then set up prompt "System.out.println("Enter first num: ");"to know whats going on for user
		//4. Then used the SCANNER variable and the DOUBLE method "fnum = Cesar.nextDouble();" to have
		//...whatever i typed in on the keyboard to be stored on first number
		//5. Then again added the SCANNER and nextDouble to snum "snum = Cesar.nextDouble();"
		//6. Then we outputted whatever those two were together, the sum "answer = fnum + snum;"
		
		//Scanner Cesar = new Scanner(System.in);
		//double fnum, snum, answer;
		//System.out.println("Enter first num: ");
		//fnum = Cesar.nextDouble();
		//System.out.println("Enter second num: ");
		//snum = Cesar.nextDouble();
		//answer = fnum + snum;
		//System.out.println(answer);
		
		//
		
		Scanner Calculator = new Scanner(System.in);
		double firstNumber, secondNumber, result;
		System.out.println("Enter first number");
		firstNumber = Calculator.nextDouble();
		System.out.println("Enter second number");
		secondNumber = Calculator.nextDouble();
		result = firstNumber + secondNumber;
		System.out.println(result);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
