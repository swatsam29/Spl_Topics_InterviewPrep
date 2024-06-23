

class Solution {
    public int strStr(String haystack, String needle) {//first occurance of needle in a haystack string
        for (int i = 0; ; i++) { 
            for (int j = 0; ; j++) { //nested loops that iterate through the strings 
                
                
                if (j == needle.length()) //string is matched
                return i; 
                
                
                if (i + j == haystack.length()) //haystack end is reached before all characters have been matched-- needle is not present in haystack
                return -1;
                
                
                if (needle.charAt(j) != haystack.charAt(i + j)) //not matched- break loop and move to next character in haystack
                break;
            }
        }
    }
}


// Example 1:
// Input: haystack = "sadbutsad", needle = "sad"
// Output: 0
// Explanation: "sad" occurs at index 0 and 6.
// The first occurrence is at index 0, so we return 0.

// Example 2:
// Input: haystack = "leetcode", needle = "leeto"
// Output: -1
// Explanation: "leeto" did not occur in "leetcode", so we return -1.
