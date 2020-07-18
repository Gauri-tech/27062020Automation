package exceptionHandling;

public class TryCtachBlock {

	
			public static Functions fun;
			
			public static void main(String[] args) {
								
				
				try {
				// step 1 verify about link is present
				 int a=10; 
				 int b=0; 
				 System.out.println(a/b);
				}catch (Exception e)
				{
					System.out.println("Exception Occured :"+e.getMessage() );
				}
				
			
			try {
				// 2nd step verify download link is present
				String[] str=new String[2];
			str[2]="Gauri";
			}
			catch (Exception e)
			{
				System.out.println("Exception Occured :"+e.getMessage() );
			}
				// step 3verify project link is present
			
			fun.fun1();
			}

		
	
	
	
	}


