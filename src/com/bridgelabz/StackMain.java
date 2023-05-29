package com.bridgelabz;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(70);
        myStack.push(30);
        myStack.push(56);
        myStack.show();

        Integer poppedData = myStack.pop();
        if (poppedData == null)
            System.out.println("Stack is Empty");
        else
            System.out.println("The element popped is => " + poppedData);

        myStack.show();
        Stack<Integer> myQueue = new Stack<>();
        myQueue.add(56);
        myQueue.add(30);
        myQueue.add(70);
        myQueue.show();

        Integer poppedData1 = myQueue.pop();
        if (poppedData1 == null)
            System.out.println("Stack is Empty");
        else
            System.out.println("The element popped is => " + poppedData1);

    }
}
