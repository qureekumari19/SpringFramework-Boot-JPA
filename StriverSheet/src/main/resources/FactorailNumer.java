import java.util.ArrayList;
import java.util.Collections;

class FactorailNumer {

    static long factorail(long n){
        if(n==1l)
            return 1l;
        else
            return n*factorail(n-1);
    }
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        long a=n;
        ArrayList<Long> list = new ArrayList<>();
        if(n<=1l)
            list.add(1l);
        while(n>=1) {
            long s=factorail(n);
            if(s<=a)
              list.add(s);
            n--;
        }
        System.out.println(list);
     return list;
    }

    public static void main(String[] args) {
        System.out.println(factorialNumbers(6));
//        long n =5;
//        System.out.println(n* n -1);
    }
}