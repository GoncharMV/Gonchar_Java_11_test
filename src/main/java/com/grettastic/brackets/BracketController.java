package com.grettastic.brackets;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BracketController {

    public String fixBracketSequence(String sequence) {
        char[] chars = sequence.toCharArray();
        Set<Integer> remove = new HashSet<>();
        Stack<Bracket> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if (isOpenBracket(ch)) {
                stack.push(new Bracket(ch, i));
            } else if (isClosedBracket(ch)) {
                if (stack.isEmpty()) {
                    remove.add(i);
                } else {
                    Bracket last = stack.peek();
                    if (!isBracketsDontMatch(ch, last.getSymbol())) {
                        stack.pop();
                    } else {
                        remove.add(i);
                    }
                }
            }
        }

        while (!stack.isEmpty()) remove.add(stack.pop().getIndex());

        StringBuilder fixed = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (!remove.contains(i)) fixed.append(chars[i]);
        }

        return fixed.toString();
    }

    public boolean isValidBracketSequence(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (Character ch : sequence.toCharArray()) {
            if (isOpenBracket(ch)) {
                stack.push(ch);
            } else if (isClosedBracket(ch)) {
                if (stack.isEmpty()) return false;
                Character last = stack.pop();

                if (isBracketsDontMatch(ch, last)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isOpenBracket(Character ch) {
        return ch.equals('(') || ch.equals('[') || ch.equals('{');
    }

    private boolean isClosedBracket(Character ch) {
        return ch.equals(')') || ch.equals(']') || ch.equals('}');
    }

    private boolean isBracketsDontMatch(Character ch, Character last) {
        return  ch.equals(')') && !last.equals('(') ||
                ch.equals(']') && !last.equals('[') ||
                ch.equals('}') && !last.equals('{');
    }
}
