package array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] std = new String[10];
		std[0] = "Gauri";
		std[1] = "Dhara";
		std[2] = "Puja";
		std[3] = "Anshika";
		std[4] = "itishree";
		std[5] = "Bilwa";
		std[6] = "fff";
		std[7] = "ggg";
		std[8] = "hhh";
		std[9] = "iii";
		// System.out.println(std[0]);
		// System.out.println(std[3]);
		// System.out.println(std[5]);

		System.out.println(std.length);
		// for (int i = 0; i<=10; i++) 
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i]);
		}
	}

}
