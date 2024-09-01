/*
package NumberTheory_Math_BitManipulation.BitManipulation;

public class HexaDecimalConversion {
    public static void main(String[] args) {
        System.out.println(toHex(26));
    }

    public static String toHex(int num) {
        if(num<0){
            num+=Math.pow(2,32);
        }
        int i=0;
        String s;
        while(num>=16){
            int temp=num;
            num %= 16;
            s = (temp / 16)+",";
            i++;
        }
        String[] arr = new String[s.length()];
        StringBuilder s=new StringBuilder();
        for(int j=arr.length-1; j>=0; j--){
            if(j<=9){
                s.append(arr[j]);
            }else{
                if(arr[j]==10)s.append("a");
                if(arr[j]==11)s.append("b");
                if(arr[j]==12)s.append("c");
                if(arr[j]==13)s.append("d");
                if(arr[j]==14)s.append("e");
                if(arr[j]==15)s.append("f");
            }
        }
        return s.toString();
    }
}
*/
