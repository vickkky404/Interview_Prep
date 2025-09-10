package Stack;

class MyStack {
    private int[] arr;
    private int top;

    private int capacity;

    public MyStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

public class CustomStackExample {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(15);
        stack.push(25);

        System.out.println("Top element: " + stack.peek()); // 25
        System.out.println("Stack size: " + stack.size());  // 3
        System.out.println("Popped: " + stack.pop());       // 25
        System.out.println("Is empty? " + stack.isEmpty()); // false
    }
}