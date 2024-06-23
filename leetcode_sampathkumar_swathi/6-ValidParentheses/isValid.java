class Solution {
    public boolean isValid(String s) {
        // creating a empty stack
        Stack<Character> stack= new Stack<Character>();

        for(int i=0; i<s.length(); i++) //checks each char in the string
        {
            char push = s.charAt(i); //get current char

            if(push=='{'|| 
                push=='('||   
                push=='[') //openning parathesis is pushed in the stack
                stack.push(push);
            
                else{ //current character-- closing parathesis
                if(stack.isEmpty())
                    return false; 
                     // pop-- opening parathesis
                    char pop= stack.pop();
                
                    // push-- closing parathesis
                    if(push=='}' && pop != '{') 
                        return false;
                    if(push==')'&& pop != '(')
                        return false;
                    if(push==']'&& pop != '[')
                        return false;
            }
        }
        if(stack.isEmpty())// recheck if there are any opening parathesis 
            return true; 
                return false;
    }
}

// Example 1:

// Input: s = "()"
// Output: true
// Example 2:

// Input: s = "()[]{}"
// Output: true
// Example 3:

// Input: s = "(]"
// Output: false

