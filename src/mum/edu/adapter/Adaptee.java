package mum.edu.adapter;

public class Adaptee {
	private String[] data;
	private int start = 0;
	private int end = 0;
	
	public void setEnd(int end){
		this.end = end;
	}
	
	public Adaptee() {
		data = new String[10];
	}
	
	public String[] getData(){
		return data;
	}
	public int getStart(){
		return this.start;
	}
	
	public int getEnd(){
		return end;
	}
	
	public String startString(){
		return data[start];
	}
	
	
	public String endString(){
		return data[end];
	}
	
	public boolean empty(){
		return (end == -1 );
	}
	
	public void add(String str){
		end++;
		data[end] = str;
	}
	
	public void remove(int pos){
		for(int i = pos; i < end; i++ ){
			data[i] = data[i+1];
		}
	}
	public String get(int pos){
		return data[pos];
	}
}

