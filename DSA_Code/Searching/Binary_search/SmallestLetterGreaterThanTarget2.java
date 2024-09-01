package Searching.BinarySearch;

public class SmallestLetterGreaterThanTarget2 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j', 'x', 'y'};
        char target = 'x';
        System.out.println(ceilOfCharInBinarysearch(letters, target));
    }

    private static char ceilOfCharInBinarysearch(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        if(target>=letters[letters.length-1]) return letters[0];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
