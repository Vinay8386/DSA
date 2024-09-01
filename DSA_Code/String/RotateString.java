package String;

public class RotateString {
    public static void main(String[] args) {
        String s="abcde";
        String goal="bcdea";
        System.out.println(rotateString(s,goal));
    }
    public static boolean rotateString(String s, String goal) {
        //check if both strings having same length if yes than return true else return false
        if(s.length()!=goal.length()) return false;

        //If both contents are same return true else take one by one character, rotate and recheck
        int i=0;
        while(i<=s.length()){
            if(s.equals(goal)){
                return true;
            }else{
                s=(s.substring(1)+s.charAt(0));
                i++;
            }
        }
        return false;
    }
}
