package exception;

public class Dem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,6,7,5};
		try
		{
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(a[2]/0);
			System.out.println("index is out of Bounds..");
		}
		finally
		{
			System.out.println("kaushal...");
		}
	}

}
