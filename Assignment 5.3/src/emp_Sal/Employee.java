package emp_Sal;			//creation of package emp_Sal which holds different class files (Java Files) used in this program

abstract public class Employee {    //creation of abstract class to hold the abstract methods that can be used in other class
	
	int  total_leave;			//declaration of variables to integer data type	
	String empName;					//declaration of variable to String data type
	double total_Salary;				//declaration of variable to double data type
	
	public abstract void calculate_balance_leaves();			//creation of abstract method to calculate the balance leave
	public abstract boolean avail_leave(int no_of_leaves, char type_of_leave);		//creation of abstract method to avail leave
	public abstract void calculate_salary();					//creation of abstract method to calculate salary
	
}