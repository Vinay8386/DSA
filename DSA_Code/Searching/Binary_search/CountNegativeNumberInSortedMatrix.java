package Searching.BinarySearch;

public class CountNegativeNumberInSortedMatrix {
    public static void main(String[] args) {
        int[][] grid={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,1,2,3}};
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0; i<grid.length;i++){
            int j=0;
            while(j < grid[i].length && grid[i][j]>=0){
                j++;
            }
            count+=(grid[i].length-j);
        }
        return count;
    }
}
