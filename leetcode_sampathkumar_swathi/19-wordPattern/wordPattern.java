class Solution {
    public boolean wordPattern(String pattern, String str) {

        String[] words = str.split(" "); // split the input into individual words

        if (words.length != pattern.length()){ //not equal to the length-- false
            return false;
        }

        Map index = new HashMap(); // stores the index of each character 

        for (Integer i=0; i<words.length; ++i){
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i)){//index and word is not same
             return false;
            }
        }
        return true; //characters and words are same
    }    
}

// Example 1:
// Input: pattern = "abba", s = "dog cat cat dog"
// Output: true

// Example 2:
// Input: pattern = "abba", s = "dog cat cat fish"
// Output: false

// Example 3:
// Input: pattern = "aaaa", s = "dog cat cat dog"
// Output: false
