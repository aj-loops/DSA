// import java.util.Stack;

class temperatures {
    // public int[] dailyTemperatures(int[] temperatures) {

    // int n = temperatures.length;
    // int[] ans = new int[n];

    // Stack<Integer> stack = new Stack<>();

    // for (int i = 0; i < n; i++) {

    // while (!stack.isEmpty() &&
    // temperatures[i] > temperatures[stack.peek()]) {

    // int prev = stack.pop();
    // ans[prev] = i - prev;
    // }

    // stack.push(i);
    // }

    // return ans;
    // }
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (temp[i] < temp[j]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }
        return ans;
    }
}
