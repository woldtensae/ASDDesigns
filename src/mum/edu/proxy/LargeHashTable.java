package mum.edu.proxy;

import java.util.HashMap;


public class LargeHashTable implements ProxyInt{
	RealObject realObject;
	private HashMap<Integer, String> previousData;
	
	public LargeHashTable(){
		realObject = new RealObject();
		previousData = realObject.getHashtable();
	}
	
	
	public boolean isModified(){
		return (previousData == realObject.getHashtable());
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public HashMap<Integer, String> requestHandler(String request) {
		
			if(isModified()){
				previousData = (HashMap<Integer, String>) realObject.getHashtable().clone();
				return previousData;
			}
		return previousData;
	}

}
