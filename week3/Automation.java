package week3.day1.assignments;

public class Automation extends MultipleLanguage{

	public static void main(String[] args) {
		Automation a=new Automation();
        a.java();
        a.Selenium();
        a.python();
        a.ruby();
	
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}

}
