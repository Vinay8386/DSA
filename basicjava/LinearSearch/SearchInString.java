package LinearSearch;

import java.util.Arrays;

public class SearchInString {
	
	public static void main(String[] args) {
		
		String name="Vinay";
		//search n is available or not
		char target='n';
		boolean ans=stringSearch(name, target);
		System.out.println(ans);
		
		//String can be converted to char by using toCharArray() array. for ex:-
		System.out.println(Arrays.toString(name.toCharArray()));
		
	}
	
	static boolean stringSearch(String str, char target) {
		if(str.length()==0) {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if(target==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	//using enhance for loop
	static boolean stringSearch2(String str, char target) {
		if(str.length()==0) {
			return false;
		}
		
		for(char ch:str.toCharArray()) //using toCharArray() we will convert string into character
		{
			if(target==ch) {
				return true;
			}
		}
		return false;
	}

}
