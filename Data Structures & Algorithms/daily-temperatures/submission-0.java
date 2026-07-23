class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            // Current day is warmer than the day
            // represented by the index at stack top
            while (!stack.isEmpty()
                    && temperatures[i] > temperatures[stack.peek()]) {

                int previousIndex = stack.pop();

                result[previousIndex] = i - previousIndex;
            }

            // Current day is now waiting for a warmer future day
            stack.push(i);
        }

        return result;
    }
}

