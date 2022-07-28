package Inheritance;
class Hi{
	int a;
	int b;
	public void disp()
	{
		System.out.println(a+b);
	}
}
class Helloo extends Hi{
	int x;
	int y;
	public void show()
	{
		System.out.println(x+y);
	}
}
	
public class Single {

	public static void main(String[] args) {
		Helloo h = new Helloo();
		h.a=10;
		h.b=20;
		h.x=10;
		h.y=20;
		h.disp();
		h.show();
	}

}
