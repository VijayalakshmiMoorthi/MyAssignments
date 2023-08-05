package week3.day1.assignments;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();
		
	}
	public void deposit()
	{
		System.out.println("This is overridding method");
	}

}
