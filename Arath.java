package exception;

public class Arath{
public static void main(String[]args)
{
	int num1=34;
	int num2=0;
	int a[]= {23,44,22,13,67};
	String name="a";
	int result=0;
	try
	{
		result=num1/num2;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Div: "+result);
		
	}
	System.out.println("elemet at given index is:"+a[0]);
	System.out.println("Length in given string is:"+name.length());
	
}
}
