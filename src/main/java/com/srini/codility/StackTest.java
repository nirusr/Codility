package com.srini.codility;
import java.io.*;
import java.util.Stack;
public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		for (int i = 0; i < stack.size(); i ++) {
			System.out.println(stack.pop());
		}
	}
}
