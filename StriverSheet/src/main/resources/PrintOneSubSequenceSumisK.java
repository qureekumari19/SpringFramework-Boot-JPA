import java.util.*;

class PrintOneSubSequenceSumisK {
    public static int countAllSubSequenceSumisK(int a[],int k,int i, ArrayList<Integer> l,int sum,int t){
        if(i>=a.length){
            if(sum<=k) {
                System.out.println(l);
                 return 1;
            }
            else
                return 0;
        }
        l.add(a[i]);
        sum += a[i];
        int q=countAllSubSequenceSumisK(a,k,i+1,l,sum,t+1);
        sum -= a[i];
        l.remove(l.size()-1);
        int r=countAllSubSequenceSumisK(a,k,i+1,l,sum,t+1);

        return q+r;
    }

    public static boolean printOneSubSequenceSumisK(int a[],int k,int i, ArrayList<Integer> l,int sum){
        if(i>=a.length){
            if(sum==k) {
                System.out.println(l);
                return true;
            }
            return false;
        }
        l.add(a[i]);
        sum += a[i];
        if(printOneSubSequenceSumisK(a,k,i+1,l,sum) == true)
             return true;
        sum -= a[i];
        l.remove(l.size()-1);
        if(printOneSubSequenceSumisK(a,k,i+1,l,sum) == true)
            return true;
        else
            return false;
    }
    public static void printAllSubSequenceSumisK(int a[],int k,int i, ArrayList<Integer> l,int sum){
        if(i>=a.length){
            if(sum==k) {
                System.out.println(l);
            }
            return;
        }
        l.add(a[i]);
        sum += a[i];
        printOneSubSequenceSumisK(a,k,i+1,l,sum);
        sum -= a[i];
        l.remove(l.size()-1);
        printOneSubSequenceSumisK(a,k,i+1,l,sum);
    }
    public static void reverseArray(int a[],int l,int r){
        if(l>=r)
            return;
        else {
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
        }
        reverseArray(a,l+1,r-1);

    }
    public static void main(String[] args) {
       int a[]={3,5,6,7};
       int target=9;
        reverseArray(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
       printAllSubSequenceSumisK(a,target,0,new ArrayList<Integer>(),0);
       printOneSubSequenceSumisK(a,target,0,new ArrayList<Integer>(),0);
       System.out.println(countAllSubSequenceSumisK(a,target,0,new ArrayList<Integer>(),0,0));
    }
}