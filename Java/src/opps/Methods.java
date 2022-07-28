package opps;

public class Methods {
	int empid;
	String ename;
	int salary;
	
	void display()
	{
		System.out.println(empid);
		System.out.println(ename);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Methods m = new Methods();
		m.empid=1;
		m.ename="laxana";
		m.salary=20000;
		m.display();

	}

}
