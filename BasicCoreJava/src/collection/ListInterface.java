package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		//List<String> list=new ArrayList<>();
		List<String> list=new LinkedList<>();
		//List<String> list=new Vector<>();
		list.add("Gauri");
		list.add("Puja");
		list.add("Aklesh");
		list.add("Puja");		
		for(String s:list)
		{
	System.out.println(s);
		}
	}
}
