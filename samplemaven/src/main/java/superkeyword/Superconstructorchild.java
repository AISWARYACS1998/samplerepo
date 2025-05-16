package superkeyword;

public class Superconstructorchild extends Superconstructor
{
public  Superconstructorchild()
{
	super("this is a parent constructor");
	System.out.println("constructor from child class");
	
}
	public static void main(String[] args) 
	{
		 Superconstructorchild obj=new  Superconstructorchild();
		// TODO Auto-generated method stub

	}

}
