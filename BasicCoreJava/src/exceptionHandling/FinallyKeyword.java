package exceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		
		System.out.println("disconnect the machine from internete");
		System.out.println("verify the xxxxx message id displayed");
		System.out.println("connect the machine to internet ");
			}
	catch (Exception e)
	{
		System.out.println(e.getMessage());
		//System.out.println("connect to machine");
	} finally 
	{
		System.out.println("connect the machine to internet ");
	}
	}

}
