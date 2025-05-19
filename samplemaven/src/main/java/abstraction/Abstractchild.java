package abstraction;

public class Abstractchild  extends Abstractionparent 
{

	public static void main(String[] args)
	{
		/*Abstractchild obj=new Abstractchild();//object creation
		obj.display();
		obj.print();
		obj.show();*/
		Abstractionparent obj1=new Abstractchild();//reference creation
		obj1.display();
		obj1.print();
	
		

	}

	@Override
	public void display() 
	{
		System.out.println("world");
		// TODO Auto-generated method stub
		
	}
	public void show()
	{
		System.out.println("welcome");
	}
	

}
