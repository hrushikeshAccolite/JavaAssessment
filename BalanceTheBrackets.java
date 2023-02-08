// Correct the given input by adding Parentheses in the right place
// Example:
// Input: : (8 + 2) * (2 - 1 = 10
// Output: (8 + 2) * (2 - 1) = 10

public class BalanceTheBrackets {
    public static void main(String[] args) {
    String input = "(3 * (3 + 1) - 3 * 2 + 1 = 19";
    balanceTheEq(input);
    }
    public static void balanceTheEq(String input) {
        String output = "";
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            // if the character is an open parentheses, add 1 to the count
            if (input.charAt(i) == '(') {
                count++;
                // if the character is a close parentheses, subtract 1 from the count
            } else if (input.charAt(i) == ')') {
                count--;
                // if the character is an equal sign, add the number of open parentheses to the output
            } else if (input.charAt(i) == '=') {
                if (count > 0) {
                    output += ")";
                    count--;
                }
            }
            // add the character to the output
            output += input.charAt(i);
        }
        // add the remaining open parentheses to the output
        while (count > 0) {
            output += ")";
            count--;
        }
        System.out.println(output);
        return;
    }
}