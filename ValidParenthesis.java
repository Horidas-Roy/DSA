import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String str){
         Stack<Character> stack = new Stack<>();
         char[] chars = str.toCharArray();
         for(char c : chars){
            if(c == '(' || c == '{' || c == '['){
                 stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char top = stack.peek();
                    if((c == ')' && top == '(') ||
                       (c == '}' && top == '{') || 
                       (c == ']' && top == '[')){
                       stack.pop();
                    }else{
                        return false;
                    }
                }
            }
         }

         return stack.isEmpty();
    }

    public static void main(String[] args) {
        // String str = "[{()}]"; //true
        String str = "[(}]"; //false
        System.out.println(isValid(str));
    }
}
