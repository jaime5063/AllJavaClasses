package AccessModifiersOne;

/* Java provides a number of access modifiers to set access levels
 * for classes, variables, methods and constructors. 
 * The Four Are: Default, Public, Private, and Protected*/

public class ClassTemplate { // ONLY PUBLIC or DEFAULT but public is most common
// If we remove "public" the class will only be accessible within the same package
	

	//EXAMPLES:
	int day =1; // Visible to the package. the default. No modifiers are needed.
	public     int week  =7;    // Visible to the WORLD (public)
	protected  int month =31;   // Visible to the package and all subclasses (protected)
	private  int year  =365;  // Visible to the class only (private) MST RESTRICTIVE
	
	
		public int printWeek() { // methods use all four but PUBLIC most common
			
			
			return week + day + month + year;
		}

}
