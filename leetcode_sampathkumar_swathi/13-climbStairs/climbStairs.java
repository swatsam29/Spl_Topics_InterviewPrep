
//uses dynamic programming-- bottom up approach 

class Solution {
     
    public int climbStairs(int n) { //mutual exclusive- restroom problem 
         if(n==0) // no way to climb 0 stairs
         return 0;

        int[] stair = new int[n+1]; 
        stair[0] = 1; //1 way to climb 0 stair
        stair[1] = 1; //1 way to climb 1 stair

        for(int i = 2; i <= n; i++){ //for n stairs- f(n) = f(n-1) + f(n-2)
            stair[i] = stair[i-1] + stair[i-2];
        }
        return stair[n];
    }
}


// Example 1:
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

// Example 2:
// Input: n = 3
// Output: 3
// Explanation: There are three ways to climb to the top.
// 1. 1 step + 1 step + 1 step
// 2. 1 step + 2 steps
// 3. 2 steps + 1 step