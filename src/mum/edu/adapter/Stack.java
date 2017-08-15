package mum.edu.adapter;

import java.util.Arrays;

public class Stack implements Target{
	Adaptee adaptee = new Adaptee();

	@Override
	public void push(String str) {
		adaptee.add(str);
	}

	@Override
	public String pop() {
		String str = adaptee.endString();
		adaptee.remove(adaptee.getEnd());
		return str;
	}

	@Override
	public boolean isEmpty() {
		if(adaptee.empty() == true)
			return true;
		return false;
	}

	@Override
	public void display() {
		System.out.println(Arrays.toString(adaptee.getData()));
	}
	
}
