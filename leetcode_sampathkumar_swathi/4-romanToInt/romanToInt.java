class Solution {
    public int romanToInt(String s) {
        //store the romans to integers 
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
        int result = map.get(s.charAt(s.length()-1));//start from the last roman numeral
        for (int i= s.length()-2; i >= 0; i--){//right to left we iterate 

            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))// current numeral less than next
            {
            result-= map.get(s.charAt(i));  //subtract-- integer value
            }
            else { //current numeral is greater than next
                result+= map.get(s.charAt(i)); // add-- integer value
            }
        }
        return result;
    }
}

// Example 1:
// Input: s = "III"
// Output: 3
// Explanation: III = 3.

// Example 2:
// Input: s = "LVIII"
// Output: 58
// Explanation: L = 50, V= 5, III = 3.

// Example 3:
// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

