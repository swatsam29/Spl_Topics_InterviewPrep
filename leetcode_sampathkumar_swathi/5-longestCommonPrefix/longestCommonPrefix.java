class Solution {
    public String longestCommonPrefix(String[] s) {
        
        if (s.length == 0)//array is empty
        return "";

        for (int i = 0; i < s[0].length(); ++i){//iterate each character 
        
          for (int j = 1; j < s.length; ++j){// iterate each string
            if (i == s[j].length() || //end of string
              s[j].charAt(i) != s[0].charAt(i))//character--current index != character--same index of the first string
            return s[0].substring(0, i);
          }
      }
        return s[0];//first string is common prefix
  }
}

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.