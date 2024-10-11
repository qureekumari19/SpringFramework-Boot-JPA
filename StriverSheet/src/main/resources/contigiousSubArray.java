import java.util.ArrayList;
import java.util.Arrays;

class contigiousSubArray {
    public static void subArrayContigious(int l, ArrayList<Integer> arr, int a[], int r) {
        if(l>=r) {
            return ;
        }
        arr.add(a[l]);
        subArrayContigious(l+1, arr, a, r);
        arr.remove(arr.size()-1);
        subArrayContigious(l+1, arr, a, r);
    }
    public static void subArray(int l, ArrayList<Integer> arr, int a[], int r) {
        if(l>=r) {
            System.out.println(arr);
            return ;
        }
        arr.add(a[l]);
        subArray(l+1, arr, a, r);
        arr.remove(arr.size()-1);
        subArray(l+1, arr, a, r);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        System.out.println("Contigious/NonContigious subArray");
        subArray(0, new ArrayList<>(), a, a.length);
        System.out.println("Contigious subArray");
        subArrayContigious(0, new ArrayList<>(), a, a.length);
    }
}