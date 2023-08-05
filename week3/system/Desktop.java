package org.system;

public class Desktop extends Computer{

	public static void main(String[] args) {
		
	Desktop d=new Desktop();
	d.computerMode();
	int size = d.desktopSize(30);
	System.out.println("Desktop size is  "+size+ " inches");
	}
	
	public int desktopSize(int a)
	{
		return a;
	}

}
