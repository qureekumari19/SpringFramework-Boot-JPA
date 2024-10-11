class basicMaths {

    public static int reverseNUmber(int a){
        int rev=0;
        while(a>0){
            int t=a%10;
            rev=rev*10+t;
            a=a/10;
        }
        return rev;
    }
    public static int sumOfDigit(int a){
        int l=0;
        while(a>0){
           l=l+a%10;
            a/=10;
        }
        return l;
    }
    public static int countDigit(int a){
        int l=0;
        while(a>0){
            l++;
            a/=10;
        }
        return l;
    }
    public static void main(String[] args) {
       System.out.println(countDigit(23904));
        System.out.println(sumOfDigit(23904));
        System.out.println(reverseNUmber(23904));
    }
}