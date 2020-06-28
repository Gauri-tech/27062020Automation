package ifElseStatements;

public class ifElseStatementLogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int age=18;
 boolean voterId=true;
   if(age>=18 && voterId)
   {
	   System.out.println("you are eligibe");
   }
	
	else {
		System.out.println(" not eligible");
	}
	


	// or operator
  boolean panCard=true;
  boolean aadharCard=true;
  
  if(panCard || aadharCard)
  { System.out.println("You are eligible");
  }
  else {System.out.println("You are not eligible");
  }
  }
  }