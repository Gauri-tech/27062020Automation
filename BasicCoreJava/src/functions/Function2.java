package functions;

public class Function2 {

	public static String name="Gauri";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   
			   System.out.println(name);
			


		sum (10,20);
	sum (20,30);
	sum(40,50);
	sum(10,20,30);
	message("Gauri");
	eligible ( "Gauri", 25);
	eligible ("abd",17);
	
	}

   public static void sum( int a , int b)
   {
  System.out.println(a+b);
}
   public static void sum( int a , int b, int c)
   { System.out.println(a+b+c);
   }
  public static void message(String name)
  {
	  System.out.println("Welcome"+name);
  }
	public static void eligible(String name, int age) 
	{
       if(age>=18)
		{System.out.println(" you are eligible");
		}
       else
       {
       System.out.println("you are not eligibe");
       }
	}

}

