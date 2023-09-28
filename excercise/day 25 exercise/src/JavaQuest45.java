/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */

import java.util.Stack;

public class JavaQuest45 {
    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
        System.out.println(backspaceCompare("ab##", "c#d#"));
        System.out.println(backspaceCompare("a#c", "b"));

    }

    // Approach 1
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != '#') {
                stack1.push(s.charAt(i));
            } else {
                stack1.pop();
            }
        }
        for (int j = 0; j < t.length(); j++) {
            if (t.charAt(j) != '#') {
                stack2.push(s.charAt(j));
            } else
                stack2.pop();
        }
        if (stack1 == stack2)
            return true;
        return false;
    }

}
