import java.util.ArrayList;
import java.util.Arrays;

class Findallfactorialnumberslessthanorequalton{

    public static int SumuptoK(int n){
        int sum=0;
        if(n<1)
            return sum;
        else {
            return sum+n+SumuptoK(n-1);
        }
    }
     public static int factorial(int n){
         int sum=0;
         if(n==1)
             return 1;
         else {
             return n*SumuptoK(n-1);
         }
     }
     public static void reverseArray(int a[],int l,int r){
         if(l>=r)
             return ;
         else {
             int t=a[l];
             a[l]=a[r];
             a[r]=t;
             reverseArray(a,l+1,r-1);
         }

     }
     public static boolean pallindrome(String s,int l,int r){

          if(l>=r)
              return true;
          if (s.charAt(l) != s.charAt(r))
              return false;
         else {
             return s.charAt(l)==s.charAt(r) && pallindrome(s,l+1,r-1);
         }
     }
     public static int nthFibo(int n){


         if(n==1)
             return 0;
         if(n==2)
             return 1;
         else
             return nthFibo(n-1)+nthFibo(n-2);
     }
     public static void suArray(int i, ArrayList<Integer> l,int a[]){

        int n=a.length;
        if(i>=n){
            System.out.println(l);
            return ;
        }
        l.add(a[i]);
        suArray(i+1,l,a);
        l.remove(l.size()-1);
        suArray(i+1,l,a);
     }
    public static boolean subArraySum(ArrayList<Integer> l,int k){
        int n=0;
        for(int i=0;i<l.size();i++){
            n=n+l.get(i);
        }
        if(n==k)
            return true;
        else
            return false;
    }
    public static void suArraySumk(int i, ArrayList<Integer> l,int a[],int k){

        int n=a.length;
        if(i>=n){
            if(subArraySum(l,k)) {
                System.out.println(l);
            }
            return ;
        }
        l.add(a[i]);
        suArraySumk(i+1,l,a,k);
        l.remove(l.size()-1);
        suArraySumk(i+1,l,a,k);
    }
     public static void main(String[] args) {
         System.out.println(SumuptoK(3));
         System.out.println(factorial(4));
         int a[]={1,2,3,4,5};
         reverseArray(a,0,a.length-1);
         for(int i=0;i<a.length;i++)
             System.out.print(a[i]+" ");
         System.out.println();
         System.out.println(pallindrome("123421",0,5));
         System.out.println(nthFibo(6));
         ArrayList<Integer> l=new ArrayList<Integer>();
         suArray(0,l,a);
         System.out.println("SubArray Sum is: ");
         suArraySumk(0,l,a,5);
     }
 }