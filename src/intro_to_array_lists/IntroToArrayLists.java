package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> stuff = new ArrayList<String>();
		stuff.add("My man!");
		stuff.add("I am awesome!");
		stuff.add("My coding is dabest!");
		stuff.add("Marry me!");
		stuff.add("kiss me!");
		//2. Add five Strings to your list
		for (int i = 0; i < stuff.size(); i++) {
			System.out.println(stuff.get(i));
		}
		//3. Print all the Strings using a standard for-loop
		for (String h : stuff) {
			System.out.println(h);
		}
		//4. Print all the Strings using a for-each loop
				for (int i = 0; i < stuff.size(); i++) {
					if ((i/2)==0) {
					System.out.println(stuff.get(i));
					}
				}
		//5. Print only the even numbered elements in the list.
		for (int i = stuff.size(); i > 0; i++) {
			System.out.println(stuff.get(i));
		}
		for (int i = 0; i < stuff.size(); i++) {
			for (int x = 0; x < stuff.get(i); x++) {
				
			}
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
