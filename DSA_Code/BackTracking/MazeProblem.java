package BackTracking;

import java.util.ArrayList;

//start coordinate (rowStart, colStart) = (0, 0)
//destination coordinate (rowDest, colDest) = (3,3)
//Count number of path
//Print all the path
//return list of all the path
public class MazeProblem {
    public static void main(String[] args) {
        int[][] maze=
                {
                        {0,0,0},
                        {0,0,0},
                        {0,0,0}
                };
        int row=0, col=0;
        System.out.println(countPath(maze,row,col));
        displayPath(maze," ",row,col);
        System.out.println(printPath(maze," ",row,col));
    }
    //return number of a path
    static int countPath(int[][] maze, int row, int col) {
        //base condition
        if(row== maze.length-1 || col== maze.length-1){
            return 1;
        }
        int down=countPath(maze,row+1,col);
        int right=countPath(maze,row,col+1);
        return down+right;
    }
    //Display all the path
    static void displayPath(int[][] maze,String p, int row, int col) {
        //base condition
        if(row== maze.length-1 && col== maze.length-1){
            System.out.println(p);
            return ;
        }
        if(row< maze.length-1){
            displayPath(maze,p+'D',row+1,col);
        }
        if(col< maze.length-1){
            displayPath(maze,p+'R',row,col+1);
        }
    }
    //Print list of all the path
    static ArrayList<String> printPath(int[][] maze,String p, int row, int col) {
        //base condition
        if(row== maze.length-1 && col== maze.length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> path=new ArrayList<>();
        if(row<maze.length-1){
            path.addAll(printPath(maze,p+'D',row+1,col));
        }
        if(col< maze.length-1){
            path.addAll(printPath(maze,p+'R',row,col+1));
        }
        return path;
    }
}
