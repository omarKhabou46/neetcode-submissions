class Solution {
    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int sum = 0;

        while (i < j) {
            if (height[i] == 0)  {
                i++;
                continue;
            }else if (height[j] == 0){
                j--;
                continue;
            }else {
                int k = i + 1;
                int min = Math.min(height[i], height[j]);
                while (k  < j) {
                    if (height[k] < min) {
                        sum += (min - height[k]);
                        height[k] = min;
                    }
                    k++;
                }
            }
            if (height[i] < height[j]) i++;
            else j--;
        }
        return sum;
    }
}
