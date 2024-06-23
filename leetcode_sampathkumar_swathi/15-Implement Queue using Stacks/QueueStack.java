class MyQueue {
    
    public void push(int x) {
      input.push(x);
    }
  
    public int pop() {
        //stack is not empty
      peek();
      return output.pop();
    }
  
    public int peek() {
        //input is popped and output is pushed
      if (output.isEmpty())
        while (!input.isEmpty())
          output.push(input.pop());
      return output.peek();
    }
  
    public boolean empty() {//validate stacks are empty
      return input.isEmpty() && output.isEmpty();
    }


    //stacks to store the elements
    private Deque<Integer> input = new ArrayDeque<>();
    private Deque<Integer> output = new ArrayDeque<>();
}
  
  /**
   * Your MyQueue object will be instantiated and called as such:
   * MyQueue obj = new MyQueue();
   * obj.push(x);
   * int param_2 = obj.pop();
   * int param_3 = obj.peek();
   * boolean param_4 = obj.empty();
   */

   /**
 * Implementation of a queue using two stacks.
 */

// Example 1:

// Input
// ["MyQueue", "push", "push", "peek", "pop", "empty"]
// [[], [1], [2], [], [], []]
// Output
// [null, null, null, 1, 1, false]

// Explanation
// MyQueue myQueue = new MyQueue();
// myQueue.push(1); // queue is: [1]
// myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
// myQueue.peek(); // return 1
// myQueue.pop(); // return 1, queue is [2]
// myQueue.empty(); // return false