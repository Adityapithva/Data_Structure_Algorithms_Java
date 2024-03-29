package Stack_Data_Structure;
import java.util.Stack;
public class ReverseStr {
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c : chars){
            stack.push(c);
        }
        for(int i=0;i<str.length();i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "ADITYA";
        System.out.println("Before reverse:"+str);
        System.out.println("After reverse:"+reverseString(str));
    }
}
