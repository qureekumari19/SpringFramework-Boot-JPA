import java.util.*;

class MathPlaylist {

//   Question1: Print Divisor of a number
    public static void printDivisor(int a){
//        Approach1 ---->
//        for(int i=1;i<=a;i++){
//            if(a%i==0){
//                System.out.print(i+" ");
//            }
//        }
        //        Approach2 ---->
               TreeSet<Integer> divisors = new TreeSet<>();
                for(int i=1;i<=(int)(Math.sqrt(a));i++){
                    if(a%i==0){
                        divisors.add(i);
                        divisors.add(a/i);
                    }
                }
        System.out.print(divisors);
    }

    public static void main(String[] args) {
        printDivisor(19);
    }
}