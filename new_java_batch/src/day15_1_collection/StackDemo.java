package day15_1_collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer>numStack=new Stack<Integer>();
		
		
		numStack.push(10);
		numStack.push(20);
		numStack.push(30);
		//checking top of the stack
		System.out.println("top of the stack : " +numStack.peek());
		
		//popping element out of stack
		System.out.println("element removed: "+numStack.pop());
		
	}
}