
class Solution {
    public int missingNumber(int[] nums) { 
         Set<Integer> numSet = new HashSet<Integer>(); //storing the numbers in the array

            for (int num : nums) //add all the numbers in the array nums-- to the set numSet
            numSet.add(num);

        int n = nums.length + 1; 

        for (int number = 0; number < n; number++) { //iteration of all numbers 0 to n
            if (!numSet.contains(number)) { //number is not present in the set-- missing number
                return number;
            }
        }
        return -1; //no missing number
    }
}