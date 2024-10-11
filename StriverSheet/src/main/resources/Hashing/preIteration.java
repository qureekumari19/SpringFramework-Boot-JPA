import java.util.*;

public class preIteration {
    public static int findCount(int a[],int t){
                int arr[]=new int[10];
                for(int i=0;i<a.length;i++){
                    arr[a[i]]=arr[a[i]]+1;
                }
                System.out.println(Arrays.toString(arr));
                return arr[t];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int a[]={1,2,3,1,5};
        System.out.println(findCount(a,1));
    }
}