package mum.edu.adapter;

public class testAdapter {
	public static void main(String[] args){
		Target target = new Queue();
		Target target1	= new Stack();
		target.push("Aman");target.push("Ameha");target.push("Meron");
		target.display();
	}
}
