class subarrayOfSumK {

    public static void check(int a[], int k) {
        int i=0,j=0,sum=0;
        while(i<a.length && j<a.length){
            if(sum==k){
                System.out.print(i+" "+j);
                j++;
                break;
            }
            else if(sum>k){
                sum-=a[i];
                i++;
            }
            else{
                sum+=a[j];
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={1, 2, 3};
        check(a,3);
    }
}