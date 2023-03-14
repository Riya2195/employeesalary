package employeesalary;

public class TotalSalary extends CalculateSalary{
	
	private int totalsalary;
	
	public int getTotalsalary()
	{
		totalsalary=getPay()+getHra()-getPf()-getDeductions()+getBonus();
		return totalsalary;
	}
//slip Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by hand
	
	public void getSalarySlip()
	{
		
		System.out.println("SALARY SLIP");

		System.out.println("Basic Pay is : "+getPay());
		System.out.println("Deductons is: "+getDeductions());
		System.out.println("Hra is: "+getHra());
		System.out.println("PF is: "+getPf());
		System.out.println("Total salary by hand is  is: "+totalsalary);



	}
	
	
	
}
