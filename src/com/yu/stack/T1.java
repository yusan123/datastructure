package com.yu.stack;

/**
 * @Author yu
 * @DateTime 2021/5/13 20:48
 */
public class T1 {

    public static void main(String[] args) {

        ArrayStack<Integer> arrayStack = new ArrayStack<>(12);

        for (int i = 0; i < 5; i++) {
            arrayStack.push(i);
            System.out.println(arrayStack);
        }

        arrayStack.pop();
        arrayStack.pop();

        System.out.println(arrayStack);

        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("([]{[([)]})[{}]{}"));
        System.out.println(isValid("([)[]]{}"));
    }


    // leetcode stack problem 括号匹配
    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        ArrayStack<String> stack = new ArrayStack<>();
        String[] split = s.split("");
        for (String s1 : split) {
            if (stack.isEmpty() || "[".equals(s1) || "(".equals(s1) || "{".equals(s1)) {
                stack.push(s1);
            } else {
                String top = stack.peek();
                if (("(".equals(top) && ")".equals(s1))
                        || ("[".equals(top) && "]".equals(s1))
                        || ("{".equals(top) && "}".equals(s1))) {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
