class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] ans = new int[n];
        
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        
        for (int i = 0; i < n; i++) {
            
            // Check for warmer temperature
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }
            
            stack.push(i);
        }
        
        return ans;
    }
}