class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {

            int j = i - 1;
            int k = i + 1;
            int countJ = 0;
            int countK = 0;
            while (j >= 0) {
               if (heights[j] > heights[i]) {
                countJ++;
                j--;
               }
               else break;
            }

             while (k < heights.length) {
               if (heights[k] >= heights[i]) {
                 countK++;
                 k++;
               }
               else break;
            }

            int c = (countJ + countK);
            if (c == 0) c = heights[i];
            else c = (c + 1) * heights[i];

            if (max < c) max = c;
        }
        return max ;
    }
}
