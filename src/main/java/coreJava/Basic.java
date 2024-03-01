package coreJava;

public class Basic {
	public void m1()
	{
		System.out.println("m1 method");
	}
	public interface i1
	{
		public void m2();

		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public class Basic1 extends Basic
	{
		
	}
	
	public class Basic2 implements i1
	{
		
		public void m2(){
			System.out.println("Hi");
		}
		
	}
	
	
}
