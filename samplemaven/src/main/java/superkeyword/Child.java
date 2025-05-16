package superkeyword;



public class Child extends Super
{
	String color="blue";

	public void display()
	{
		
		System.out.println(color);
		System.out.println(super.color);
	}

		
		public static void main(String[] args)
		{
			Child obj=new Child();
			obj.display();
			// TODO Auto-generated method stub

		}

	}

	
		
