package oops.polymorphism;

import oops.inheritence.Mobile;
import oops.inheritence.SmartPhone;
import oops.inheritence.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {

		/*
		 * SmartPhone obj = new SmartPhone(); Mobile obj2 = new Mobile();
		 */
		Telephone obj3 = null; // WedDriver
		// obj3 = new Telephone();
		// obj3.calling();

		String browserName= "Chrome";

		if (browserName.equals("Chrome")) {

			obj3 = new Mobile(); // Chrome driver
			// obj3.calling();
		} 
		else if (browserName.equals("FireFox")) {
			obj3 = new SmartPhone();// Firefox
			
		}
			obj3.calling();
		

	}

}
