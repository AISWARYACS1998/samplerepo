package samplemaven;

import java.util.Scanner;

public class Employee 
{
double basicpay,deduction,bonus;
public void display()
{
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter basic pay : ");
	basicpay=s.nextDouble();
	System.out.println("enter deduction : ");
	deduction=s.nextDouble();
	System.out.println("enter bonus : ");
	bonus=s.nextDouble();
	
}
}
