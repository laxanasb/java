package opps;

public class Employee {
	int empid;
	String name;
	int salary;
	int deptno;
	
	 void display()
	 {
		 System.out.println(empid);
		 System.out.println(name);
		 System.out.println(salary);
		 System.out.println(deptno);
	 }

	public static void main(String[] args) {
		Employee emp1= new Employee();
		// initializing values of class variables using object
		emp1.empid=01;
		emp1.name="Laxana";
		emp1.salary=20000;
		emp1.deptno=02;
		emp1.display();
		
		
					
			
		}

	
	}	


