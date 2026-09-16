import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

class Solution {
  public int evalRPN(String[] tokens) {

    Deque<Integer> operandStack = new ArrayDeque<Integer>();

    List<String> operators = List.of("+", "-", "*", "/");

    for (int i = 0; i < tokens.length; i++) {
      if (operators.contains(tokens[i]) && operandStack.size() >= 2) {
        Integer latter = operandStack.removeLast();
        Integer former = operandStack.removeLast();
        if (tokens[i].equals("+")) {
          operandStack.add(former + latter);
        } else if (tokens[i].equals("-")) {
          operandStack.add(former - latter);
        } else if (tokens[i].equals("*")) {
          operandStack.add(former * latter);
        } else if (tokens[i].equals("/")) {
          operandStack.add(former / latter);
        }
      } else {
        operandStack.add(Integer.parseInt(tokens[i]));
      }
    }

    return operandStack.size() > 0 ? operandStack.removeLast() : 0;
  }
}