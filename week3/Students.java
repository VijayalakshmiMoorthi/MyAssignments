package week3.day1.assignments;

public class Students {

	public static void main(String[] args) {
		
		Students s=new Students();
		int studentId = s.getStudentInfo(12345);
		System.out.println("Student Id is "+studentId);
		String studentName = s.getStudentInfo(12345, "Vijayalakshmi");
		System.out.println("Student Name is "+studentName);
		long studentphno = s.getStudentInfo("viji@test.com", 123456789);
		System.out.println("Student phone number is "+studentphno);
		
	}

	public int getStudentInfo(int id)
	{
		return id;
	}
	public String getStudentInfo(int id, String name)
	{
		return name;
	}
	public long getStudentInfo(String email, long phoneNumber)
	{
		return phoneNumber;
	}
}
