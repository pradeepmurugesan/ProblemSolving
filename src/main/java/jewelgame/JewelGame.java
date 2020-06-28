package jewelgame;

import java.util.Stack;

public class JewelGame {

    public int getMaxScore(String jewels) {
        Stack<String> stack = new Stack<>();
        int score = 0;
        String[] input = jewels.split("");
        for(String s: input) {
            if(stack.isEmpty()) {
                stack.push(s);
            } else if(stack.peek().equals(s)) {
                stack.pop();
                score++;
            } else {
                stack.push(s);
            }
        }

        return score;
    }
}
