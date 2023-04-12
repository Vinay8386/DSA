package CyclicSort;

public class MissingNumberCyclicSort {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 4, 0 };
		System.out.println(missingElement(arr));
	}

	public static int missingElement(int[] arr) {

		int i = 0;
		
		while (i < arr.length) {
			int correctIndex = arr[i];
			if (arr[i]<arr.length && arr[i] != arr[correctIndex]) {
				swap(arr, i, correctIndex);
			} else {
				i++;
			}
		}
		
		//search for first missing number in shorted array
		for (int j = 0; j < arr.length; j++) {
			if(arr[j]!=j) {
				return j;
			}
		}
		return arr.length;
	}

	public static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
	}
}
