package exception;

public class exc1 {
	static void m1() {
		m2();
	}
	static void m2()
	{
		m3();
	}
	static void m3()
	{
		m4();
	}
	static void m4()
	{
		m5();
	}
	
public static void m5()
{
	String n=null;
	System.out.println(n.length());
}
public static void main(String[] args)
{
	m1();
}
}