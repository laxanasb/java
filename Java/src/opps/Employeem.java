package opps;

public class Employeem {
	int empid;
	String ename;
	int salary;
	int deptno;
	
	void setdata(int id,String name,int sal,int no)
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
		Employeem emp1 = new Employeem();
		emp1.setdata(1,"laxana", 2000, 2);
		emp1.display();

	}

}
