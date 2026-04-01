class Solution {
    public int evalRPN(String[] tokens) {
        
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        
        for (String token : tokens) {
            
            // Check if token is operator
            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {
                
                int b = stack.pop(); // second operand
                int a = stack.pop(); // first operand
                
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b); // truncates toward zero
                        break;
                }
                
            } else {
                // If number → push to stack
                stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop();
    }
}