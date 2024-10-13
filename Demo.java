package exception;

public class Demo {
void method1()
{
	System.out.println("in method 1");
	method2();
}
void method2()
{
	System.out.println("in method 2");
	method3();
}
void method3()
{
	System.out.println("in method 3");
	method4();
}
void method4()
{
	try
	{
		
	System.out.println(54/0);
	}catch(ArithmeticException ae){
		System.out.println("catched exception");
	}
	System.out.println("by by");
	
}
void arrDemo()
{
	int a[]= {10,20,30,40,50};
	try {
		System.out.println(a[6]);
}catch(ArrayIndexOutOfBoundsException ae){
	System.out.println("out of bound..");
}
}
void StringDemo()
{
	String name="null";
	System.out.println(name);
	System.out.println(name.length());
}
public static void main(String[] args)
{
Demo d1=new Demo();
d1.method1();
d1.arrDemo();
d1.StringDemo();
}
}
