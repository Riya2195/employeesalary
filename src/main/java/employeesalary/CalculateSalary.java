package employeesalary;

public class CalculateSalary extends DetailsSalary {
	
	private int hra;
	private int pf;
	
	public int getHra()
	{
		hra=(getPay()*5/100);
		return hra;
	}
	
	public int getPf()
	{
		pf=(getPay()*20/100);
		return pf;
	}

}
