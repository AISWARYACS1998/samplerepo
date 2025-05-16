package aggregation;

public class Childaggreggation 
{
String city,state;
Parentaggregation ref;
public Childaggreggation (String city,String state,Parentaggregation ref)
{
	this.city=city;
	this.state=state;
	this.ref=ref;
}
public void display()
{
	System.out.println(ref.name+ref.rollno+ref.address);
	System.out.println(city+""+state);
}
	public static void main(String[] args) 
	{
		Parentaggregation obj=new Parentaggregation ("aiswarya ",01," abcd");
		Childaggreggation obj1=new Childaggreggation ("tsr "," kerala",obj);
		obj1.display();
		// TODO Auto-generated method stub

	}

}
