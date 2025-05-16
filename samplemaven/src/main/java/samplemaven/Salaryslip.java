package samplemaven;

public class Salaryslip extends Salary
{
	double totalsalary;
	public void total()
	{
		double salary=basicpay+hra+bonus;
		double totaldeduction=pf+deduction;
		totalsalary=salary-totaldeduction;
		System.out.println("salaryslip");
		System.out.println("basicpay = "+basicpay);
		System.out.println("deduction = "+deduction);
		System.out.println("hra = "+hra);
		System.out.println("pf ="+pf);
		System.out.println("salary ="+salary);
		System.out.println("total salary = "+totalsalary);
		
		
	}

	public static void main(String[] args)
	{
		Salaryslip obj=new Salaryslip();
		obj.display();
		obj.calculate();
		obj.total();
		// TODO Auto-generated method stub

	}

}
