import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class arraylist {

	public static void main(String[] args) {

		//Create obj for array list 

		ArrayList Fruits =new ArrayList();
		System.out.println("**ADD LIST***");

		Fruits.add("Lemon");
		Fruits.add("Orange");
		Fruits.add("Mango");
		Fruits.add("Apple");
		/*	System.out.println(Fruits);

		System.out.println("**REMOVE ITEM***");
		Fruits.remove("Lemon");

		System.out.println(Fruits);
		System.out.println("**REMOVE ITEM***");

		Fruits.add(1, "pine");
		System.out.println(Fruits);*/

		for (int i=0;i<Fruits.size();i++) 

		{
			System.out.println(Fruits.get(i));
		}
		System.out.println("CONVERT ARRAY TO LIST");
		System.out.println("**********************");
		String[] name= {"Java","selenium"};
		List names =Arrays.asList(name);
		System.out.println(names);
		boolean b=names.contains("Java");
		System.out.println(b);	

	}

}
