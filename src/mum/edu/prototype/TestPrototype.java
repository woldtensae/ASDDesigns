package mum.edu.prototype;

public class TestPrototype {
	public static void main(String[] args) {
		Sheep newSheep = new Sheep();
		Sheep clonedSheep = (Sheep) newSheep.makeCopy();
		System.out.println("new sheep: " + newSheep);
		System.out.println("cloned sheep: " + clonedSheep);
	}
}
