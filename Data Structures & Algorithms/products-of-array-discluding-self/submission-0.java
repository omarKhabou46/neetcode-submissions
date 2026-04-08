class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length - 1];
        int[] sufix = new int[nums.length - 1];
        int[] array = new int[nums.length];

        int pr = 1;
        for (int i = 0; i < prefix.length; i++) {
           pr *= nums[i];
           prefix[i] = pr;
        }
         
        int su = 1;
        for (int j = nums.length - 1; j > 0; j--) {
            su *= nums[j];
            sufix[j - 1] = su;
        }
        
        array[0] = sufix[0];
        array[array.length - 1] = prefix[prefix.length - 1];

        for (int k = 0; k < prefix.length - 1; k++) {
            array[k + 1] = prefix[k] * sufix[k + 1];
        }
        
        return array;
       
        
    }
}  
