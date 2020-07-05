package functions;

public class CallVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Variables.name);
 Variables ref=new Variables();
  // change values
  ref.name="Anand";
  ref.name2="Puja";
   Variables ref2= new Variables();
   System.out.println(ref2.name);
   System.out.println(ref.name);

   System.out.println(ref2.name2);
   System.out.println(ref.name2);
	
	
	}

}
