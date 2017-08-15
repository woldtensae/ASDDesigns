package mum.edu.adapter;

import java.util.Arrays;

public class Queue implements Target{
	Adaptee adaptee = new Adaptee();
	@Override
	public void push(String str) {
		int start = adaptee.getStart();
		String[] data = adaptee.getData();
		for(int i=adaptee.getEnd();i>=start;i--){
			data[i+1] = data[i];
			adaptee.setEnd(adaptee.getEnd()+1);
		}
		data[start] = str;
	}

	@Override
	public String pop() {
		String str = adaptee.get(adaptee.getEnd());
		adaptee.remove(adaptee.getEnd());
		return str;
	}

	@Override
	public boolean isEmpty() {
		if(adaptee.empty()==true)
			return true;
		return false;
	}
	
	@Override
	public void display() {
		System.out.println(Arrays.toString(adaptee.getData()));
	}
}
