package interfaceexample;

public class Interface2 implements Interface1
{
public void display1()
{
	System.out.println("hello");
}
	public static void main(String[] args)
	{
		/*Interface2 obj=new Interface2();
		obj.display();
		obj.display1();
		obj.print();*/
		Interface1 obj1=new Interface2();
		obj1.display();
		obj1.print();
		
			
		// TODO Auto-generated method stub

	}
	@Override
	public void display()
	{
		System.out.println("world");
		// TODO Auto-generated method stub
		
	}
	public void print()
	{
		System.out.println("hi");
	}

}
