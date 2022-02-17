class Node {

  int val;
  Node next;

  Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }
}


class Main {

  Node top;
  Node tail;
  int length;
  

  Main() {
    this.top = null;
    this.tail = null;
    this.length = 0;
  }
  
  public static void main(String[] args) {
    //System.out.println("Hello world!");

    Main stk = new Main();

    stk.push(4);
    stk.push(2);
    int n = stk.pop();
    System.out.println("Poped value is: " + n);
    stk.print();

    System.out.println("Peek value is: "+ stk.peek());

    System.out.println("Line break");
    stk.push(8);
    stk.push(10);
    stk.push(15);

    System.out.println("Peek value is: "+ stk.peek());

    stk.print();
    System.out.println("Line break");

    n = stk.pop();
    stk.print();
    System.out.println("Line break");
    System.out.println("Peek value is: "+ stk.peek());
    
    n = stk.pop();
    stk.print();
    System.out.println("Line break");
    System.out.println("Peek value is: "+ stk.peek());
    
    n = stk.pop();
    stk.print();
    System.out.println("Line break");
    System.out.println("Peek value is: "+ stk.peek());
    
    n = stk.pop();
    stk.print();
    
  }

  public void push(int val) {

    if(this.length == 0) {
      Node n = new Node(val, null);
      this.top = n;
      this.tail = n;
      this.length++;
      return;
    }

    Node n = new Node(val, null);
    n.next = this.top;
    top = n;
    length++;
  }

  public void print() {
    Node n = this.top;

    while(n != null) {
      System.out.println(n.val);
      n = n.next;
    }
  }

  public int pop() {

    int retval = -1;
    if(this.top == null) {
      return retval;
    }
    if(this.top == this.tail) {
      retval = this.top.val;
      this.length--;
      this.top = this.top.next;
      this.tail = this.tail.next;
      return retval;
    }

    retval = this.top.val;
    this.top = this.top.next;
    this.length--;
    return retval;
  }

  public int peek() {

    if(this.top == null)
      return -1;

    return this.top.val;
  }
}