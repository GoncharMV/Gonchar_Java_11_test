package com.grettastic;

import java.util.Stack;

public class BracketValidation {

    public static boolean isValidBracketSequence(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (Character ch : sequence.toCharArray()) {
            if (ch.equals('(') || ch.equals('[') || ch.equals('{')) {
                stack.push(ch);
            } else if (ch.equals(')') || ch.equals(']') || ch.equals('}')) {
                if (stack.isEmpty()) return false;
                Character last = stack.pop();

                if (
                        ch.equals(')') && !last.equals('(') ||
                        ch.equals(']') && !last.equals('[') ||
                        ch.equals('}') && !last.equals('{')
                ) {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }
}
