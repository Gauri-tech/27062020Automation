package functions;

public class Returntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int add= sum(10,20);
  System.out.println("sumis"+add);
 boolean c=eligible(10);
 if(c) {
 System.out.println("you are eligible");
 
 }
 else
	 {
	 System.out.println(" you are not eligible");
	 }
	}
	public static int sum(int a, int b)
	{
		return a+b;
		
	}
public static boolean eligible (int age)	
{
	if (age>=18)
	{
		return true;
	}
	else
		{
		return false;
		}
	
	}
}


