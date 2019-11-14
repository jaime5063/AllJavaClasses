package AccessModifiersTwo;

import AccessModifiersOne.ClassTemplate;

  public class ProgramB {
	
	  public static void main(String[] args) {
		  
		  ClassTemplate objt = new ClassTemplate();
		  
		  // objt.  --> only gives you the option to select: week
		  	// Why? -- > because week was set to public 
		  // Protected --> only available in the Package
		  // Default --> only available in the package
		  // Private --> only available in the class
	
		  
		  System.out.println(objt.printWeek());
		  // printWeek (method) --> available because it was set to Public
		  
	  }
	

}
