package emp_Sal;					//creation of package emp_Sal which holds different class files (Java Files) used in this program

public class TemporaryEmployee extends Employee{			//creation of class TemporaryEmployee which extends the class Employee to access the methods and variables of the class 
	
	final int total_leave = 10, max_salary = 25000;		//declaration of integer type variables
	int leave_taken, leave_left;							//declaration of integer type variables	
	double salary;										//declaration of double type variables
	
	public void setLeave(int no_of_leaves) {				//setter method to store leav_taken
		this.leave_taken = no_of_leaves;					//stores the value of no_of_leaves in leave_taken
	}
	public int getLeave() {								//getter method to return leave_taken value
		return leave_taken;								//returns leave_taken value
	}
	
	@Override
	public void calculate_balance_leaves() {				//overriding the method of class Employee
			
		leave_left = total_leave - leave_taken;			//calculation of leaves left
		if(leave_left < 0) {									//condition to check how many leaves are left
			System.out.println("You dont have any more leaves left");		//if satisfies prints statement
		}
		else {
			System.out.println("You have " +leave_left+ " number of leaves left to use");		//else prints this statement
		}
	}

	@Override
	public boolean avail_leave(int no_of_leaves, char type_of_leave) {		//overriding of method of class Employee
		if(total_leave < no_of_leaves) {										//checks condtion 
			return true;														//if condition staisfies returns true
		}
		else {
		return false;														//else return false
		}
	}

	@Override
	public void calculate_salary() {						//overriding of method of class Employee
		if(leave_taken < total_leave) {					//checks the condition
			salary = max_salary * 12;					//if statisfies calculates salary 
			System.out.println("Salary: " +salary);		//displays salary on console
		}
		else {
			salary = (max_salary/2) * 12;				//else runs this code to calculate salary
			System.out.println("Salary: " +salary);		//prints the salary on console
		}
	}	
	
	public void display(int id, String name) {		//display function to display the output
		System.out.println("Employee ID: "+id);		//statement prints id 
		System.out.println("Employee Name: "+name);	//statement print name
		calculate_balance_leaves();					//displays left leaves and displays output
		calculate_salary();							//calculates salary and displays output
	}
}
