class arrayProblem {
    public static int subarraySum(int[] nums, int k) {
        int i=0,j=0,n=nums.length,sum=0,l=0;
        while(i<n && j<n){
            if(sum==k) {
                l++;
                sum = 0;
                System.out.println(i + " " + j);
                i++;
            }
                sum+=nums[j];
                j++;
            else{
                sum-=nums[i];
                i++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3,4,2}, 6));
    }
}