package LinearSearch;

public class NumberExistOrNot {
	
	public static void main(String[] args) {
		
		//take an arry and find 14 is available or not if available than print with position
		
		int[] num= {22,45,32,14,73,96};
	/*	for (int i = 0; i < num.length; i++) {
			if (num[i]==14) {
				System.out.println("num["+i+"] is "+num[i]);
			}
		}*/
		
		
		//enhance for loop
		for(int k:num) {
			if (k==14) {
				//how to print the position here ?
				System.out.println(k);
		}
	}
  }
}
