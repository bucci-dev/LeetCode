import java.util.Stack;

public class isValid {
    public static void main(String[] args) {
        String input = "";
        System.out.println(isValid(input));
    }
    public static boolean isValid(String s) {
        Stack<String> inputstack = new Stack<>();
        Stack<Character> inputstack2 = new Stack<>();


        if (s.length() % 2 != 0) {
            return false;
        }

        for (int x=0; x < s.length()/2; x++) {
            Character c = s.charAt(x);
            inputstack.push(c.toString());
        }

        for (int x=0; x < s.length()/2; x++) {
            Character c = s.charAt(s.length()/2 + x);
            String z = inputstack.reversed().get(x);

            switch (z) {
                case "(":
                    if (c.toString().equals(")")) {
                        break;
                    }
                    else {
                        return false;
                    }
                case "[":
                    if (c.toString().equals("]")) {
                        break;
                    }
                    else {
                        return false;
                    }
                case "{":
                    if (c.toString().equals("}")) {
                        break;
                    }
                    else {
                        return false;
                    }

            }
        }

        return true;
    }
}


// Answer
/*
// Create hashmap to store the pairs...
HashMap<Character, Character> Hmap = new HashMap<Character, Character>();
        Hmap.put(')','(');
        Hmap.put('}','{');
        Hmap.put(']','[');
// Create stack data structure...
Stack<Character> stack = new Stack<Character>();
// Traverse each charater in input string...
        for (int idx = 0; idx < s.length(); idx++){
        // If open parentheses are present, push it to stack...
        if (s.charAt(idx) == '(' || s.charAt(idx) == '{' || s.charAt(idx) == '[') {
        stack.push(s.charAt(idx));
        continue;
        }
        // If the character is closing parentheses, check that the same type opening parentheses is being pushed to the stack or not...
        // If not, we need to return false...
        if (stack.size() == 0 || Hmap.get(s.charAt(idx)) != stack.pop()) {
        return false;
        }
        }
        // If the stack is empty, return true...
        if (stack.size() == 0) {
        return true;
        }
        return false;
*/