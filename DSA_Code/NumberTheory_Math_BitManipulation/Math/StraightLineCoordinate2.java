package NumberTheory_Math_BitManipulation.Math;

public class StraightLineCoordinate2 {
    public static void main(String[] args) {
        int[][] coordinates={{0,0},{1,0},{-1,0}};
        System.out.println(checkStraightLine(coordinates));
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        int i=1;
        while(i<=coordinates.length-2){
            double m1 = (coordinates[i][0] - coordinates[i - 1][0]) == 0 ? Double.POSITIVE_INFINITY :
                    (double) (coordinates[i][1] - coordinates[i - 1][1]) / (coordinates[i][0] - coordinates[i - 1][0]);

            double m2 = (coordinates[i + 1][0] - coordinates[i][0]) == 0 ? Double.POSITIVE_INFINITY :
                    (double) (coordinates[i + 1][1] - coordinates[i][1]) / (coordinates[i + 1][0] - coordinates[i][0]);
            if(m2==m1){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
}
/*
If the line is vertical, meaning the denominator is zero, you can use a special value for the slope to
 represent it. In Java, you can use Double.POSITIVE_INFINITY for positive infinity,
 and Double.NEGATIVE_INFINITY for negative infinity. However, for the purpose of comparing slopes
 in your code, you can use any consistent value that won't interfere with the equality check.
 */