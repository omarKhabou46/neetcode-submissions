class Solution {
    public int trap(int[] height) {
        // int i = 0;
        // int j = height.length - 1;
        // int sum = 0;

        // while (i < j) {
        //     if (height[i] == 0)  {
        //         i++;
        //         continue;
        //     }else if (height[j] == 0){
        //         j--;
        //         continue;
        //     }else {
        //         int k = i + 1;
        //         int min = Math.min(height[i], height[j]);
        //         while (k  < j) {
        //             if (height[k] < min) {
        //                 sum += (min - height[k]);
        //                 height[k] = min;
        //             }
        //             k++;
        //         }
        //     }
        //     if (height[i] < height[j]) i++;
        //     else j--;
        // }
        // return sum;

        int i = 0;
        int j = height.length - 1;
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        while (i < j) {
                int min = Math.min(height[i], height[j]);
                if (!stack.isEmpty()) {
                    int minStack = stack.peek();
                    if (min < minStack) {
                        sum += (minStack - min);
                    }else {
                        stack.push(min);
                    }
                }else if (min != 0){
                    stack.push(min);
                }
            if (height[i] < height[j]) i++;
            else j--;
        }
        return sum;
    }
}
