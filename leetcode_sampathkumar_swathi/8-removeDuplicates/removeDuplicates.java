class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1; //length of the new array
       
        for (int i=0; i<nums.length-1; i++) // compares each element with the adjacent element 
        
        {
            if(nums[i]!=nums[i+1]) // checks for duplicates and stores it in the num[j] array
            {
                nums[j]=nums[i+1];
                j++;
            }
        }
        return j; 
    }
}