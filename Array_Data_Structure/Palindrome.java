package Array_Data_Structure;
public class Palindrome {
    public static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length-1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
    }
}
