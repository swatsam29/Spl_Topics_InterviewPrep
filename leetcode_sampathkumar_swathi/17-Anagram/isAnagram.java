class Solution {
    public boolean isAnagram(String s, String t) {
        int count1[] = new int[26];
        int count2[] = new int[26];

        if(s.length()!=t.length()) //different lengths-- false
        return false;

        for(int i=0;i<s.length();i++){ //checks each character in the two arrays 
            count1[(s.charAt(i) - 'a')]++;
            count2[(t.charAt(i)-'a')]++;
        }

        if(Arrays.equals(count1,count2)) // arrays are equals -- true else false
        return true;
        else
        return false;
   }
}

// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true

// Example 2:
// Input: s = "rat", t = "car"
// Output: false