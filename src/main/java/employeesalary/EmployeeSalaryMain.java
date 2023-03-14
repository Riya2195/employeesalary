package employeesalary;

public class EmployeeSalaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DetailsSalary d = new DetailsSalary();
		d.setPay(50000);
		d.setBonus(20000);
		d.setDeductions(3000);
		
		

		CalculateSalary c = new CalculateSalary();
		c.getHra();
		c.getPf();

		TotalSalary t = new TotalSalary();
		t.getTotalsalary();
		t.getSalarySlip();

	
	}

}
