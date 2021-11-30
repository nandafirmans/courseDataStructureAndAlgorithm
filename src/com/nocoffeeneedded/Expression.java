package com.nocoffeeneedded;

import java.util.Stack;

public class Expression {
    public boolean isBalanced(String input) {
        var stack = new Stack<Character>();
        for (char c : input.toCharArray()) {
            if (c == '(')
                stack.push(c);

            if (c == ')') {
                if (stack.isEmpty())
                    return false;

                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
