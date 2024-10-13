package exception;


class Arthmetic extends Exception
{
	Arthmetic ()
	{
		System.out.println("hhh");
	}
}

class Arithm1  
{
	
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }
    
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // Division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred: " + e.getMessage());
        }
}

}



