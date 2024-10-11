class IntToBinary {
    public static void main(String[] args) {
        int n=10;
        String s="";
        while (n>=1){
            s=s+n%2;
            n/=2;
        }
        System.out.println(new StringBuilder(s).reverse().toString());
    }
}