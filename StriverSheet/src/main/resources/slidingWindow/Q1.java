class Q1{
    public static void main(String[] args) {
        int a[]={-1,2,3,3,4,5,-1};
        int k=4;
        int l=0,r=k-1;
        int n=a.length;
        int s=0;
        int max=0;
        while(r<n){
            for(int i=l;i<=r;i++){
                s=s+a[i];
            }
            if(max<s){
                max=s;
                s-=a[l];
                l++;
                r++;

            }
        }
        System.out.println(max);
    }
}