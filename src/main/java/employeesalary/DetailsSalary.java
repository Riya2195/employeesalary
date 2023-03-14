package employeesalary;

public class DetailsSalary {
	
	static  int pay;
	static int deductions;
	static int bonus;
	
	public void setPay(int pay)
	{
		DetailsSalary.pay=pay;
	}
	public void setDeductions(int deductions)
	{
		DetailsSalary.deductions=deductions;
	}
	public void setBonus(int bonus)
	{
		DetailsSalary.bonus=bonus;
	}
	public int  getPay()
	{
		return pay;
	}
	public int getBonus()
	
	{
		return bonus;
	}
	public int getDeductions()
	{
		return deductions;
	}
	public void display() {
		System.out.println("Pay is " + pay);
		System.out.println("Bonus is " + bonus);
		System.out.println("Deductions is " + deductions);

}
}
