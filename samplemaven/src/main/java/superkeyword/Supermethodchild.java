package superkeyword;

public class Supermethodchild extends Supermethod
{
public void print()
{
	System.out.println("this a child class");
	super.display();
}
	public static void main(String[] args) 
	{
		Supermethodchild obj=new Supermethodchild();
		obj.print();
		// TODO Auto-generated method stub

	}

}
