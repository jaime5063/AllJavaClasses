package come.HwClassAndObject;

public class Main {
	
//	String name;
//	int roll_no;
//
//	public static void main(String[] args) {
//
//		HwObjClass names = new HwObjClass();
//		names.name = "John";
//		names.roll_no = 2;
//		System.out.println("Name is " + names.name + " and roll number is " + names.roll_no);
//
//	}
//------------------------------------------------
/*create a class named 'Main' with specific attributes.

For you to do:

Create two objects in which you will be assigning the following values.
carColor='Black'
carModelYear=2019
carName='BMW'

carColor='White'
carModelYear=2018
carName='Toyota'

Car color is Black and car model year is 2019 and car name is BMW
Car color is White and car model year is 2018 and car name is Toyota
*/	
//	String carColor, carName;
//	int carModelYear;
//	
//	void car() {
//		System.out.println("Car color is "+carColor+" and car model year is "+carModelYear+" and name is "+carName);
//	}
//
//	public static void main(String [] args) {
//		
//		HwObjClass car=new HwObjClass();	
//		car.carColor="Black";
//		car.carModelYear=2019;
//		car.carName="BMW";
//		car.car();
//		
//		HwObjClass car2=new HwObjClass();
//		car2.carColor="White";
//		car2.carModelYear=2018;
//		car2.carName="Toyota";
//		car2.car();
//}
//------------------------------------------------
/*
Create a Class Main that should be a template for the DogClass. 
In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

The output of the program should be as following:
 
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play	
 */
	String breed, name, color;
	
	void bark(){
		System.out.println(breed+" can bark");
	}
	void run() {
		System.out.println(breed+" can run");
	}
	void play() {
		System.out.println(breed+" can play");
	}
public static void main(String[]args) {
	
	Main dog=new Main();	
	dog.breed="Husky";
	dog.name="Max";
	dog.color="Light Brown";
		dog.bark();
		dog.run();
		dog.play();
			Main dog2=new Main();	
			dog2.breed="Bulldog";
			dog2.name="Panther";
			dog2.color="Black";
				dog2.bark();
				dog2.run();
				dog2.play();	
					Main dog3=new Main();	
					dog3.breed="Labrador";
					dog3.name="Hunter";
					dog3.color="White & Black";
						dog3.bark();
						dog3.run();
						dog3.play();
		
}	
//-------------------------------------------------------------------------------
/*
For you to do:
1. create method and name as m1. Inside your method body add print statement as "m1 method implementation"
2. create another method and name as m2. Inside your method body add print statement as "m2 method implementation"
3. Call these two methods in the main method
 */	
//	String name;
//	
//	void name() {
//		System.out.println(name+" method implementation");
//	}
//	public static void main(String[] args) {
//		Main names = new Main();
//		names.name = "m1";
//		names.name();
//
//		Main names2 = new Main();
//		names.name = "m2";
//		names.name();
//
//	}
//--------------------------------------------------------
/*
   For you to do 
1. Create method name it as newLine
2. Add print statement inside method body as "newLine method implementation"
3. Call newLine method three times
Expected Output:
newLine method implementation
newLine method implementation
newLine method implementation	
 */
//	String name;
//	
//	void statement() {
//		System.out.println(name+" method implementation");
//	}
//	public static void main(String[] args) {
//		
//		Main repeat=new Main();
//		repeat.name="newLine";
//		for(int i=0; i<3; i++) {
//			repeat.statement();
//		}
//	}
//----------------------------------------------------------------------
/*
For you to do:
1. Create a method name as newLine that should have print statement inside the method body as "newLine method implementation"
1. Create a method name as displayLine that should have print statement inside the method body as "displayLine method implementation"
3. Call both methods
Expected Output:
newLine method implementation
displayLine method implementation
 */
//	String name;
//	
//	void newMethod() {
//		System.out.println(name+" method implementation");
//	}	
//	public static void main(String [] args) {
//		
//		Main twoMethods=new Main();
//		twoMethods.name="newLine";
//		twoMethods.newMethod();
//		
//		Main disp=new Main();
//		disp.name="displayLine";
//		disp.newMethod();
//	}
//------------------------------------------------------
/*
Instructions from your teacher:
For you to do:
1. Create one method as syntaxTechnologies and write the logic for that method in println statement as "Welcome to Syntax Technologies!"
2. Create another method as syntaxStudents and write the logic for that method in println statement as "Welcome Syntax Students!"
3. Call both methods
Expected Output:
Welcome to Syntax Technologies!
Welcome Syntax Students!	
 */
//	String name;
//	void welcome() {
//		System.out.println("Welcome to "+name+" Technologies");
//	}
//	void students() {
//		System.out.println("Welcome "+name+" Students");
//	}
//	public static void main(String [] args) {
//		Main class1=new Main();		
//		class1.name="Syntax";
//		class1.welcome();
//		class1.students();
//		
//		
//	}
//------------------------------------------------------
/*
For you to do:
1. create a method as forLoop and write the logic in the method body to print numbers from 1 to 10
2. Call the method in the main method
Expected Output:
1
2
3
4
5
6
7
8
9
10	
 */
//	void forLoop() {
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//	}
//
//	public static void main(String[] args) {
//
//		Main loops = new Main();
//		loops.forLoop();
//	}
//	
	
	
	

}
