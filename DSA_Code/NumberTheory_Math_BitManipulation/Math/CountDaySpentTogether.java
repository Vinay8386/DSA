package NumberTheory_Math_BitManipulation.Math;

public class CountDaySpentTogether {
    public static void main(String[] args) {
        String arriveAlice = "09-01", leaveAlice = "10-19", arriveBob = "06-19", leaveBob = "10-20";
        System.out.println(countDaysTogether(arriveAlice,leaveAlice,arriveBob,leaveBob));
    }
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int count=0;
        //extract month and date from string into string array
        String[] aa=arriveAlice.split("-");
        String[] la=leaveAlice.split("-");
        String[] ab=arriveBob.split("-");
        String[] lb=leaveBob.split("-");

        //convert String array value to integer value
        //For Alice
        int aam=Integer.parseInt(aa[0]);
        int aad=Integer.parseInt(aa[1]);
        int lam=Integer.parseInt(la[0]);
        int lad=Integer.parseInt(la[1]);
        //For Bob
        int abm=Integer.parseInt(ab[0]);
        int abd=Integer.parseInt(ab[1]);
        int lbm=Integer.parseInt(lb[0]);
        int lbd=Integer.parseInt(lb[1]);

        int[] mon={31,28,31,30,31,30,31,31,30,31,30,31};
        //calculate which day Alice will come and which day Bob will come
        int ada=dayCalculator(aam,aad,mon);
        int lda=dayCalculator(lam,lad,mon);
        int adb=dayCalculator(abm,abd,mon);
        int ldb=dayCalculator(lbm,lbd,mon);

        // Calculate the overlap of days when both Alice and Bob are in Rome
        int overlapStart = Math.max(ada, adb);
        int overlapEnd = Math.min(lda, ldb);

        // Check if there is a positive overlap
        if (overlapStart <= overlapEnd) {
            return overlapEnd - overlapStart + 1;
        } else {
            return 0;
        }
    }
    //Calculate day by using date month and year
    static int dayCalculator(int x,int y,int[] mon){
        int day=0;
        for(int i=0;i<x-1;i++){
            day+=mon[i];
        }
        return day+y;
    }
}
