
class Solution {
    public int[] twoSum(int[] num, int target) {

         Map<Integer, Integer> numToIndex = new HashMap<>(); 

            for (int i = 0; i < num.length; ++i) { //iterate through each no

            if (numToIndex.containsKey(target - num[i])) //true-- 6-4= 2 
            return new int[] {numToIndex.get(target - num[i]), i}; //numToIndex-get(2)=1

            numToIndex.put(num[i], i); //false-- not there in the hashmap-- add the current no to its index
        }
        throw new IllegalArgumentException();
    }
}


//Input: nums = [3,2,4], 
//target = 6
//Output: [1,2]