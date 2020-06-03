import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        char[] ch = A.toCharArray();
        for (int i = 0; i < n; i++) {
            if((ch[i] != '(') && (ch[i] != '[') && (ch[i] != '{') &&
                    (ch[i] != ')') && (ch[i] != ']') && (ch[i] != '}')) {
                return false;
            }
            if((ch[i] == '(') || (ch[i] == '[') || (ch[i] == '{')) {
                stack.push(ch[i]);
            }
            if((ch[i] == ')') || (ch[i] == ']') || (ch[i] == '}')) {
                if(stack.isEmpty()) {
                    return false;
                }
                if ((stack.peek() == '(' && ch[i] == ')') || (stack.peek() == '[' && ch[i] == ']') ||
                        (stack.peek() == '{' && ch[i] == '}') ) {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(chkParenthesis(str, str.length()));
    }
}