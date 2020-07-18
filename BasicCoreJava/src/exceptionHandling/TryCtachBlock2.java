package exceptionHandling;

public class TryCtachBlock2 {

	public static Functions fun;

	public static void main(String[] args) {

		try {
			// step 1 verify about link is present
			int a = 10;
			int b = 2;
			System.out.println(a / b);

			// 2nd step verify download link is present
			String[] str = new String[2];
			str[1] = "Gauri";

			// step 3verify project link is present

			fun.fun1();
// multiple class block
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occured :" + e.getMessage());
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured :" + e.getMessage());
		} 
		catch (NullPointerException e) {
			System.out.println("NullPointerException Occured :" + e.getMessage());
		} 
		catch (Exception e) {
			System.out.println("Exception Occured :" + e.getMessage());
		}

	}
}
