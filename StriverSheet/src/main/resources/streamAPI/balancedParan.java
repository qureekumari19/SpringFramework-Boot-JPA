import java.util.Stack;

class balancedParan {

    public static boolean match(Character s1,Character s2){
        return ((s1 ==')' && s2 =='(')|| (s1 =='}' && s2 =='{') || (s1 ==']' && s2 =='['));
    }
    public static boolean chec(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'){
                if(stack.isEmpty())
                    return false;
                else {
                    char ch = s.charAt(i);
                    match(stack.peek(),ch);
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(chec("{{]]}}"));
        System.out.println(chec("{{[]}}"));
        System.out.println(chec("{([])}"));

    }
}