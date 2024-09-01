package NumberTheory_Math_BitManipulation.Math;

public class DayCalculator {
    public static void main(String[] args) {
        String arriveAlice = "01-01";
        String[] aa=arriveAlice.split("-");
        int[] mon={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(dayCalculator(Integer.parseInt(aa[0]),Integer.parseInt(aa[1]),mon));
    }
    static int dayCalculator(int x,int y,int[] mon){
        int day=0;
        for(int i=0;i<x-1;i++){
            day+=mon[i];
        }
        return day+y;
    }
}
