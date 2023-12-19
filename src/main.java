import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Ilovepizza");
//		//This is comment
//		/*This is also comment*/
//		System.out.println("It's really good");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("What is your name? ");
//		String name = scanner.nextLine();
//		System.out.println("How old are you?");
//		int age = scanner.nextInt();
//		//We use scanner.nextline because of \n. After you input the integer, It will be "12\n".
//		scanner.nextLine();
//		System.out.println("Your favorite food?");
//		String food = scanner.nextLine();
//		
//		System.out.println("Hello "+name);
//		System.out.println("Your are "+ age + " years old.");
//		System.out.println("Your favorite food is"+food);
//		/* sysout+ctrl+space = system.out.println(); */
//		int friends =10;
//		friends--;
//		System.out.println(friends);
		
		
//		//This is GUI intro
//		String name = JOptionPane.showInputDialog("Enter your name");
//		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//		JOptionPane.showMessageDialog(null,"Hello "+name+"\nYour age is "+ age + "\nYour height is "+height);
		
		
//		//Math function
//		double x = 3.14;
//		double y = -10;
//		
//		double z = Math.abs(y);
//		double a = Math.sqrt(y);
//		/*
//		round = can be round up and down which is up to .5
//		ceil = round up
//		floor = round down
//		*/
//		double b = Math.round(x);
//		double c = Math.ceil(x);
//		double d = Math.floor(x);
//		System.out.println(Math.max(x, y));
		
		
//		//try pythagorus
//		double x,y,z;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter side x: ");
//		x = scanner.nextDouble();
//		y = scanner.nextDouble();
//		z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
//		System.out.println("THe result is " + z);
//		scanner.close();
		
		
//		//random function
//		Random random = new Random();
//		
//		//int x = random.nextInt(6)+1;
//		//double y = random.nextDouble(3);
//		boolean z = random.nextBoolean();
//		System.out.println(z);
		
		
//		//if-else statement
//		int age=60;
//		if(age>=65) {
//			System.out.println("OK Boomer!");
//		}
//		else if(age>=18) {
//			System.out.println("You are an adult!");
//		}
//		else if(age>=13) {
//			System.out.println("You are a teenager!");
//		}
//		else {
//			System.out.println("You are not an adult!");
//		}
		
		
		//switch statement
//		String day = "Friday";
//		switch(day) {
//			case "Monday":
//				System.out.println("It is Monday!");
//				break;
//			case "Tuesday":
//				System.out.println("It is Tuesday!");
//				break;
//			default:
//				System.out.println("Invalid");
//				break;
//			
//		}
		
		
		/*
		 logical operators
		 && = and
		 || = or
		 ! = not
		 */
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("You are playing a game! Press q or Q to quit.");
//		String response = scanner.next();
//		
//		if(response.equals('q') || response.equals('Q')) {
//			System.out.println("You quit the game");
//		}
//		else {
//			System.out.println("You are still playing the game *pew pew");
//		}
		
		
		//while loop
//		while(1==1) {
//			System.out.println("Help. I'm stuck in loop!!!");
//		}
//		Scanner scanner = new Scanner(System.in);
//		String name = "";
//		while(name.isBlank()) {
//			name = scanner.nextLine();
//		}
//		System.out.println("Hello " + name);
		
		
//		//for loop
//		for(int i=0;i<20;i++) {
//			System.out.println("Hi");
//		}
		
		
		//nested loop
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Input size");
//		//size n
//		int n = scanner.nextInt();
//		//loop pyramid with n line
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<(n*2)-1;j++) {
//				if(i+j>=n-1 && j-i<=n-1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		//array
//		String[] cars = {"Camero","Corvette","Tesla"};
//		//re-assigned
//		cars[0] = "Mustang";
//		System.out.println(cars[0]);
//		//To assigned the data length of array
//		String[] Item = new String[3];
//		Item[0] = "normal-chest";
//		Item[1] = "lucky-chest";
//		Item[2] = "rare-chest";
//		//To show the output of the array
//		for(int i=0;i<3;i++) {
//			System.out.println(Item[i]);
//		}
		
		
		//2D-array
//		String[][] cars = new String[2][2];
//		Scanner scanner = new Scanner(System.in);
//		//example
//		//String[][] cars = {"camero","Corvette"},{"Toyota","Mitsubushi"};
//		//loop scanning the input
//		for(int i=0;i<cars.length;i++) {
//			for(int j=0;j<cars[i].length;j++) {
//				cars[i][j] = scanner.nextLine();
//			}
//		}
//		//loop showing the output
//		for(int i=0;i<cars.length;i++) {
//			for(int j=0;j<cars[i].length;j++) {
//				System.out.print(cars[i][j] + " ");
//			}
//		}
		
		
//		//String Methods
//		//String = a reference data type that can store one or more characters
//		//		   reference a data types have access to useful methods
//		String name = "Bro";
//		boolean result1 = name.equals("bro"); //true
//		boolean result2 = name.equals("bro"); //false
//		int result3 = name.length(); //length = num of alphabet
//		char result4 = name.charAt(0); // 0 is index
//		int result5 = name.indexOf("o"); //find index
//		//check if its empty, if its empty, it will be true, if not empty, then false
//		boolean result6 = name.isEmpty();
//		//-------------------------------------
//		String result7 = name.toUpperCase(); //To uppercase
//		String result8 = name.toLowerCase(); // To lowercase
//		/*
//		 trim = remove space
//		 Example your string is "   Bro   "
//		 If you use trim, then your string will be "Bro"
//		*/
//		String result9 = name.trim();
//		/*
//		 replace the char replace(oldChar,NewChar)
//		 Example its ("o","a")
//		 Strings name = "Bro";
//		 name will be "Bra";
//		 */
//		String result10 = name.replace('o', 'a');
		
		
		// //Wrapper classes = provides a way to use primitive data types as reference data types
		// 					//reference data types contain useful methods
		// 					//can be used with collections (ex.ArrayList)
		// //primitive		//wrapper
		// //---------		//--------
		// //boolean		Boolean
		// //char			Character
		// //int 			Integer
		// //double 		Double

		// //autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper class
		// // unboxing = the reverse of autoboxing. Automatic conersion of wrapper class to primitive

		// Boolean a = true;
		// Character b = '@';
		// Integer c = 123;
		// Double d = 3.14;
		// String e = "Bro";

	}
}
