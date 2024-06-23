class MyStack {
    
    public void push(int x) {
      q.offer(x);
      for (int i = 0; i < q.size() - 1; ++i)//converting the queue to stack order
        q.offer(q.poll());
    }
  
    public int pop() { //removes the top element from the stack
      return q.poll();
    }
  
    public int top() { //without removing the top element of the stack and return the value 
      return q.peek();
    }
  
    public boolean empty() {//check if stack is empty
      return q.isEmpty();
    }
  
    private Queue<Integer> q = new ArrayDeque<>(); //store the elements in a queue 
  }

// Example 1:

// Input
// ["MyStack", "push", "push", "top", "pop", "empty"]
// [[], [1], [2], [], [], []]
// Output
// [null, null, null, 2, 2, false]

// Explanation
// MyStack myStack = new MyStack();
// myStack.push(1);
// myStack.push(2);
// myStack.top(); // return 2
// myStack.pop(); // return 2
// myStack.empty(); // return False