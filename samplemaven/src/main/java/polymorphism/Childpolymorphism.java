package polymorphism;

public class Childpolymorphism extends Parentpolymorphism
{
public void sum(int a,int b) 
{
	super.sum(4,5);
	int sum=a-b;
	System.out.println(sum);
}
	public static void main(String[] args)
	{
		Childpolymorphism obj=new Childpolymorphism();
		obj.sum(4, 2);
			
		// TODO Auto-generated method stub

	}

}
