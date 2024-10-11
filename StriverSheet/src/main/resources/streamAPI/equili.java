class equili {

    public static int check(int a[]){

        int leftSum[]=new int[a.length];
        int rightSum[]=new int[a.length];
        leftSum[0]=a[0];
        rightSum[a.length-1]=a[a.length-1];
       for(int i=1;i<a.length;i++){
           leftSum[i]=leftSum[i-1]+a[i];
       }
        for(int i=a.length-2;i>1;i--){
            rightSum[i]=rightSum[i+1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            if(leftSum[i]==rightSum[i]){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={ -7, 1, 5, 2, -4, 3, 0};
        System.out.println(check(a));
    }
}