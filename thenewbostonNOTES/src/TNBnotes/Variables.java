package TNBnotes;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A variable in JAVA is a placeholder for something else
		//example x = 73 (now you know variable x stands for 73
		//Different types of Variable examples...int 3, 3.12, S, bucky (tell JAVA what variable you are
		//...working with so it doesnt get confused.
		
		//Today we will use a "DOUBLE"
		//A DOUBLE= Tells JAVA you are going to work with a number, 
		//...but this number can have a decimal point
		
		//"=" is called the "Assignment Operator" which will give a value to Tuna
		double tuna;
		tuna = 5.28;
		
		System.out.println(tuna);
		
		//You can also combine with strings of text
		//difference between "System.out.print" and "System.out.println"
		//"System.out.print"= We want to print this but we want to stay on the same line
		//"System.out.println"= anything after this will go on the NEXT LINE
		
		double tunaa;
		tunaa = 13.75;
		
		System.out.print("The movie costs ");
		System.out.print(tunaa);
		System.out.println(" per ticket");
		System.out.print ("want to buy the tickets?");
	}

}
