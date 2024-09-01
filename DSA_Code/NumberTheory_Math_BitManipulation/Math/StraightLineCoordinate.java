package NumberTheory_Math_BitManipulation.Math;

public class StraightLineCoordinate {
    public static void main(String[] args) {
        int[][] coordinates={{0,0},{1,0},{-1,0}};
        System.out.println(checkStraightLine(coordinates));
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        int n=coordinates.length;
        if(n==2){
            return true;
        }
        int x0=coordinates[0][0];
        int y0=coordinates[0][1];
        int x1=coordinates[1][0];
        int y1=coordinates[1][1];
        for(int i=2;i<n;i++){
            int x=coordinates[i][0];
            int y=coordinates[i][1];

            if((y1-y0)*(x-x1)!=(y-y1)*(x1-x0)){
                return false;
            }
        }
        return true;
    }
}
/*
In place of multiplication if you use division ((y1-y0)/(x1-x0)!=(y-y1)/(x-x1))
It will give arithmatic exception, and In this case you need to use
Double.POSITIVE_INFINITY OR Double.NEGATIVE_INFINITY for not getting this exceptiom
check StraightLineCoordinate2 class for this
 */