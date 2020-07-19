package stringClass;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "anand";
		
		String[] arr=str.split("");
		// how many a are persent in string

		//int count = 0;
		//for (int iter = 0; iter < str.length(); iter++) {
			//if (str.charAt(iter) == 'a' || str.charAt(iter) == 'A') 
			//{
			///	count++;
			//}
		//}

		//System.out.println(count);

	int count=0;
	
	for(String c:arr)
	{
	
		if(c.equals("a"))
			count++;
	}
	System.out.println("Total number of count a:"+count);
	
	}

}
