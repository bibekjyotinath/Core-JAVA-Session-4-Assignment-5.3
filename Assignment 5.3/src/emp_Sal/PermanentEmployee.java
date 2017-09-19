package emp_Sal;			//creation of package emp_Sal which holds different class files (Java Files) used in this program

public class PermanentEmployee extends Employee{    //PermanentEmployee Class created which extends Employee class
	
	int paid_leave = 5, sick_leave = 2, casual_leave = 3;		//declaration of integer type variables
	final double basic = 35000, hra = 10000, pfa = 15000;		//declaration of double type variables
	int leave_taken, leave_left, p_leave, s_leave, c_leave, pl_left, sl_left, cl_left;	//declaration of integer type variables
	double salary;											//declaration of double type variables
	
	public void setPaid(int paid) {		//setter method to store value
		this.p_leave = paid;				//stores the value of paid in p_leave
	}
	public int getPaid() {
		return p_leave;					//returns value of p_leave	
	}
	public void setSick(int sick) {		//setter method to store value
		this.s_leave = sick;				//stores the value of sick in s_leave
	}
	public int getLeave() {				
		return s_leave;						//returns value of s_leave	
	}
	public void setCasual(int casual) {     //setter method to store leav_taken
		this.c_leave = casual;				//stores the value of no_of_leaves in leave_taken
	}
	public int getCasual() {
		return c_leave;						//returns value of c_leave
	}
	@Override
	public void calculate_balance_leaves() {				//overriding of method of class Employee
		
		leave_taken = p_leave + s_leave + c_leave;			//calculates leaves_taken
		leave_left = total_leave - leave_taken;				//calculates leaves left
		pl_left = 5 - p_leave;								//calculates paid leaves left
		sl_left = 2 - s_leave;								//calculates sick leaves left
		cl_left = 3 - c_leave;								//calculates casual leaves left
		if(p_leave < 0) {									//if condition
			System.out.println("You dont have any more leaves left");			//if true prints this statement on console
		}
		else
		{
			System.out.println("You have " +pl_left+ " number of leaves left to use");  //else prints this statement on console
		}
		if(c_leave < 0) {												//if condition
			System.out.println("You dont have any more leaves left");		//if true prints this statement on console
		}
		else
		{
			System.out.println("You have " +cl_left+ " number of leaves left to use");	//else prints this statement on console
		}
		if(s_leave < 0) {													//if condition
			System.out.println("You dont have any more leaves left");			//if true prints this statement on console
		}
		else
		{
			System.out.println("You have " +sl_left+ " number of leaves left to use");    //else	 prints this statement on console
		}
		if(leave_left < 0) {														//if condition	
			System.out.println("You dont have any more leaves left");				//if true prints this statement on console
		}
		else {
			System.out.println("You have " +leave_left+ " number of leaves left to use");   //else prints this statement on console
		}
	}

	@Override
	public boolean avail_leave(int no_of_leaves, char type_of_leave) {     //overriding of method of class Employee
		
		if((p_leave < 5)||(s_leave < 2)||(c_leave < 3)) {			//checks condition
			return true;									//if statisfies returns true	
		}
		else {
		return false;							//else returns false
		}
	}
	
	@Override		
	public void calculate_salary() {						//overriding of method of class Employee
		
		if((p_leave<5)||(c_leave<3)||(s_leave<2)) {			//checks condtion 
			salary = (basic+ hra +pfa) * 12;					//calculates salary	
			System.out.println("Salary: "+salary);			//displays salary
		}
		else												//if condition fails
		{
			salary = ((basic+ hra +pfa)/2) * 12;			 //calculates salary 
			System.out.println("Salary: "+salary);		//displays salary
		}
	}		 
	
	public void display(int id, String name) {		//display function to display the output
		System.out.println("Employee ID: "+id);		//statement prints id 
		System.out.println("Employee Name: "+name);	//statement print name
		calculate_balance_leaves();					//displays left leaves and displays output
		calculate_salary();							//calculates salary and displays output
	}
}
