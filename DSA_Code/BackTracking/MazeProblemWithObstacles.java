package BackTracking;

import java.util.ArrayList;

//start coordinate (rowStart, colStart) = (0, 0)
//destination coordinate (rowDest, colDest) = (3,3)
//obstacles is if cordinated value is 1. In below maze[1][1] is obstacles
public class MazeProblemWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println(printPath(maze," ",0,0));
        displayPath(maze," ",0,0);
    }
    //Print list of all the path
    static ArrayList<String> printPath(boolean[][] maze, String p, int row, int col) {
        //base condition
        if(row== maze.length-1 && col== maze.length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        //check if we have obstacles
        if(!maze[row][col]){
            return new ArrayList<>(); // Return an empty list if an obstacle encountered
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
    //Display all the path
    static void displayPath(boolean[][] maze, String p, int row, int col) {
        //base condition
        if(row== maze.length-1 && col== maze.length-1){
            System.out.println(p);
            return;
        }
        //check if we have obstacles
        if(!maze[row][col]){
            return;
        }
        if(row< maze.length-1){
            displayPath(maze,p+'D',row+1,col);
        }
        if(col< maze.length-1){
            displayPath(maze,p+'R',row,col+1);
        }
    }
}
