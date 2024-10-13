package exception;

public class dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int []a= {3,4,5,6,7,5};
         try
         {
        	  System.out.println(a[10]);
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
        	 System.out.println("Index is out of bound...");
         }
         finally
         {
        	 System.out.println("existing..");
         }
	}

}
