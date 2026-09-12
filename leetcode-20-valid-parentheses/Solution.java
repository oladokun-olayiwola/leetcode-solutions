import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> closingBrackets = new ArrayDeque<>();

        char[] as = s.toCharArray();

        for (char a : as) {
            if (a == '(') {
                closingBrackets.add(')');
            } else if (a == '[') {
                closingBrackets.add(']');
            } else if (a == '{') {
                closingBrackets.add('}');
            } else if (a == ')' || a == ']' || a == '}') {

                if (closingBrackets.isEmpty() ||
                    a != closingBrackets.removeLast()) {
                    return false;
                }
            }
        }

        return closingBrackets.isEmpty();
    }
}