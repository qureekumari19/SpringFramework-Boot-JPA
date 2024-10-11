package ProgrammingCoding;

import java.util.Scanner;

public class Solution{
    public static int reverse(int x) {
        long d=x;
        if(d<-2147483648 ||d>2147483647)
            return 0;
        if(x>0){
            String rev=Integer.toString(x);
            StringBuilder st=new StringBuilder(rev);
            rev=st.reverse().toString();
            if(Long.valueOf(rev)>2147483647 || Long.valueOf(rev)<-2147483648)
                return 0;
            else
                return Integer.valueOf(rev);
        }
        else if(x<0){
            String rev=Integer.toString(x*-1);
            StringBuilder st=new StringBuilder(rev);
            rev=st.reverse().toString();
            if((Long.valueOf(rev)*-1)>2147483647 || (Long.valueOf(rev)*-1)<-2147483648)
                return 0;
            else
                return Integer.valueOf(rev)*-1;
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        System.out.println(reverse(new Scanner(System.in).nextInt()));
    }
}