package mum.edu.prototype;

public class Sheep implements Animal{

	public Sheep(){}
	
	@Override
	public Animal makeCopy() {
		Sheep clonedSheep = null;
		try {
			clonedSheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		return clonedSheep;
	}

}
