package emp_Sal;    //creation of package emp_Sal which holds different class files (Java Files) used in this program

import java.util.*;		//importing package java.util to use Scanner class

public class Employee_Salary_Cal {			//main class of the program holding the main method 
	
	public static void main(String[] args) {		//main method of the program
		
		int id, ch, leave, casual, paid, sick;
		String name;
		
		Scanner sc = new Scanner(System.in);   //creating object of scanner class 
		PermanentEmployee pe  = new PermanentEmployee();    //creating object of ParmanentEmployee class
		TemporaryEmployee te = new TemporaryEmployee();	//creating object of TemporaryEmployee class
		
		System.out.println("		Salary Calculator 	");		//print statement on console
		System.out.println(" 1. Permanent Employee");		//print statement on console
		System.out.println(" 2. Temporary Employee");		//print statement on console
		System.out.println(" 3. Exit Program");				//print statement on console
		System.out.println(" Enter your choice: ");			//print statement on console
		ch = sc.nextInt();									//take input from user and store it in ch variable
		switch(ch) {											//switch statement which depends on user input
			case 1: 											//is user chooses 1 then this case will get executed
				System.out.println(" Enter the Employee ID: ");		//print statement on console
				id  = sc.nextInt();									//take input from user and store it in id	 variable
				System.out.println(" Enter the Employee Name: ");		//print statement on console
				name = sc.next();									//take input from user and store it in name variable
				System.out.println(" Enter the Casual Leave: ");		//print statement on console
				casual = sc.nextInt();									//take input from user and store it in name variable
				System.out.println(" Enter the Paid Leave: ");		//print statement on console
				paid = sc.nextInt();									//take input from user and store it in name variable
				System.out.println(" Enter the Sick Leave: ");		//print statement on console
				sick = sc.nextInt();									//take input from user and store it in name variable
				pe.setCasual(casual);
				pe.setPaid(paid);
				pe.setSick(sick);
				pe.display(paid, name);
				break;
			case 2: 												//is user chooses 2 then this case will get executed
				System.out.println(" Enter the Employee ID: ");		//print statement on console
				id  = sc.nextInt();									//take input from user and store it in id variable
				System.out.println(" Enter the Employee Name: ");		//print statement on console
				name = sc.next();									//take input from user and store it in name variable
				System.out.println("Number of Leaves Taken: ");		//print statement on console
				leave = sc.nextInt();								//take input from user and store it in leave variable
				te.setLeave(leave);									//calling of method of TemporaryEmployee class object
				te.display(id, name);								//calling of method of TemporaryEmployee class object
				break;
			case 3:													//is user chooses 3 then this case will get executed
				System.exit(0);
			default: System.out.println("Please enter correct choice..");		//if the user provides wrong input (or out of these 3 input) this message will be printed on console
		}
		sc.close(); 		//closing of scanner class
	}
}
