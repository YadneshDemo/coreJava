package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] names = {"abc", "xyz", "pqr"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Akshay");
		list1.add("Priya");
		list1.add("Pankaj");
		
		System.out.println(list1);
		
		System.out.println("The Data at 3rd Position is:" +list1.get(2));
		
		//list1.remove(0);
		System.out.println(list1);
		
		System.out.println("The data at 1st Position is :" +list1.get(0));
		
		list1.add("Deepa");
		list1.add("Aparna");
		System.out.println(list1);
		
		System.out.println("The Last Name in the ArrayList is :" +list1.get(list1.size()-1));
		
		list1.set(2, "Yadnesh");
		System.out.println(list1);
		
		for(int i=0;i<list1.size(); i++)
		{
			if(list1.get(i).equals("Yadnesh"))
			{
			System.out.println("Value Yadnesh is at index" +i);
			}
		}
		for(String name:list1)
		{
			System.out.println(name);
		}
		Collections.sort(list1);
		System.out.println(list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);
		;
	}

}
