package week3.day1.assignments;

public abstract class MultipleLanguage implements Language,TestTool {
	
	@Override
	public void java() {
		
		System.out.println("Java");
		
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium");
	}

	public void python()
	{
		System.out.println("Python");
	}
	
	public abstract void ruby();
	

}
