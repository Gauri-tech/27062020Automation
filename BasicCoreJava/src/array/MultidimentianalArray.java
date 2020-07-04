package array;

public class MultidimentianalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[][] data = new String[4][2];
		//data[0][0] = "1";
		//data[0][1] = "1";

		///data[1][0] = "2";
		//data[1][1] = "Password2";

		//data[2][0] = "User3";
		//data[2][1] = "Password3";

		//data[3][0] = "User4";
		//data[3][1] = "Password4";

		//for (int r = 0; r < data.length; r++) {
			//for (int c = 0; c < data[r].length; c++) {
				//System.out.print(data[r][c] + " ");
			//}
			//System.out.println();
			
			String[][] data = new String[5][10];
			data[0][0] = "1";
			data[0][1] = "1";

			data[1][0] = "2";
			data[1][1] = "2";

			data[2][0] = "3";
			data[2][1] = "3";

			data[3][0] = "User4";
			data[3][1] = "Password4";
			
			data[4][0] = "User4";
			data[4][1] = "Password4";
			
			
			
			
			

			for (int r = 0; r < data.length; r++) {
				for (int c = 0; c < data[r].length; c++) {
					System.out.print(data[r][c] + " ");
				}
				System.out.println();
			
			
			
		}
	}

}
