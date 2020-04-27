import java.util.Stack;

/**
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
 *
 * S is empty;
 * S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 *
 * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
 *
 * Write a function that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [0..200,000];
 * string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */
public class Brackets {

    public int solution(String S) {
        if (S.length() % 2 == 1) {
            return 0;
        }
        Stack<Integer> roundBrackets = new Stack<>();
        Stack<Integer> squareBrackets = new Stack<>();
        Stack<Integer> curlyBrackets = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char character = S.charAt(i);
            if (character == '(') {
                roundBrackets.push(i);
            } else if (character == '[') {
                squareBrackets.push(i);
            } else if (character == '{') {
                curlyBrackets.push(i);
            } else if (character == ')') {
                if (!roundBrackets.isEmpty()) {
                    if (!squareBrackets.isEmpty() &&
                            squareBrackets.peek() > roundBrackets.peek() &&
                            squareBrackets.peek() < i) {
                        return 0;
                    } else if (!curlyBrackets.isEmpty() &&
                            curlyBrackets.peek() > roundBrackets.peek() &&
                            curlyBrackets.peek() < i) {
                        return 0;
                    } else {
                        roundBrackets.pop();
                    }
                } else {
                    return 0;
                }
            } else if (character == ']') {
                if (!squareBrackets.isEmpty()) {
                    if (!roundBrackets.isEmpty() &&
                            roundBrackets.peek() > squareBrackets.peek() &&
                            roundBrackets.peek() < i) {
                        return 0;
                    } else if (!curlyBrackets.isEmpty() &&
                            curlyBrackets.peek() > squareBrackets.peek() &&
                            curlyBrackets.peek() < i) {
                        return 0;
                    } else {
                        squareBrackets.pop();
                    }
                } else {
                    return 0;
                }
            } else if (character == '}') {
                if (!curlyBrackets.isEmpty()) {
                    if (!roundBrackets.isEmpty() &&
                            roundBrackets.peek() > curlyBrackets.peek() &&
                            roundBrackets.peek() < i) {
                        return 0;
                    } else if (!squareBrackets.isEmpty() &&
                            squareBrackets.peek() > curlyBrackets.peek() &&
                            squareBrackets.peek() < i) {
                        return 0;
                    } else {
                        curlyBrackets.pop();
                    }
                } else {
                    return 0;
                }
            }
        }
        if (!roundBrackets.isEmpty() || !squareBrackets.isEmpty() || !curlyBrackets.isEmpty()) {
            return 0;
        }
        return 1;
    }

}
