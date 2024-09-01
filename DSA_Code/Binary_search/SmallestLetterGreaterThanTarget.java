package BinarySearch;

public class SmallestLetterGreaterThanTarget {
	//Find smallest letter greater than target 
	//ex:- arr={'c','f','j'} target =a  output is c , target is c output is f,target is z output is c , target is j output is c
	
	public static void main(String[] args) {
		
		char[] letters={'c','f','j','x','y'};
		char target='z';
		ceilOfCharInBinarysearch(letters,target);
		System.out.println(ceilOfCharInBinarysearch(letters,target));
	}

	private static char ceilOfCharInBinarysearch(char[] letters, char target) {
				
		int start=0;
		int end=letters.length-1;
		
		if(target >= letters[end]) {
			return letters[ start];
		}
	
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			
			if (target < letters[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			} 
		}
		return letters[start];
		
	}

}
