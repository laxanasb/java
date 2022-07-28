package opps;

public class Employeee {
	int empid;
	String ename;
	int salary;
	int deptno;
	
	Employeee(int id,String name,int sal,int no)
	{
		empid=id;
		ename=name;
		salary=sal;
		deptno=no;
	}
	 void display()
	 {
		 System.out.println(empid);
		 System.out.println(ename);
		 System.out.println(salary);
		 System.out.println(deptno);
	 }

	public static void main(String[] args) {
		
		Employeee emp1= new Employeee(1,"Laxana",2000,2);
		emp1.display();
		
		
	}

}
