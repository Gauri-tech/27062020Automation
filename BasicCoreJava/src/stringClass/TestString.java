package stringClass;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// lenght 
		String str="Selenium";
	
	System.out.println(str.length());
	
	//2nd function charat
	char c=str.charAt(3);
	System.out.println(c);
	
	
	System.out.println(str.toUpperCase());
	
	System.out.println(str.toLowerCase());
	
	//replace
	System.out.println(str.replace("len","123"));
	
	//return string from the mentioned index
	System.out.println(str.substring(4));
	
	System.out.println(str.substring(2, 4));
	
	// split 
	String[] arr=str.split("len");
	System.out.println(arr.length);
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	
	// equal
	String str2="selenium";
	
	System.out.println(str.contentEquals(str2));
	System.out.println(str.equalsIgnoreCase(str2));
	
	}

}
