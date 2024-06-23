class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) { //perform reverse operation
            result = result * 10 + x % 10; //multiply result by 10 and add the last digit of x
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) { 
                return 0;//value is outside 32-bit rage then O
            }
            //if the value of last digit is 0 divide it by 10 and remove the last digit
            x = x / 10;
        }
        return (int) result;
    }
}


// Example 1:
// Input: x = 123
// Output: 321



// Example 2:
// Input: x = -123
// Output: -321

// Example 3:
// Input: x = 120
// Output: 21
 