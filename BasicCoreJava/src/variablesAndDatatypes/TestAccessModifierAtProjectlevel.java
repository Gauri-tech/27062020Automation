package variablesAndDatatypes;

import functions.AccessModifiers;

public class TestAccessModifierAtProjectlevel extends AccessModifiers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AccessModifiers obj=new AccessModifiers();
	obj.publicFunction();
	// You can access at project level by using child class object
	TestAccessModifierAtProjectlevel obj2=new TestAccessModifierAtProjectlevel();
	obj2.protectedFunction();
	}

}
