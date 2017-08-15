package mum.edu.proxy;

import java.util.HashMap;

public class RealObject implements ProxyInt{
	private HashMap<Integer, String> hashtable = new HashMap<Integer, String>();
	
	
	
	public HashMap<Integer, String> getHashtable() {
		return hashtable;
	}



	public void setHashtable(HashMap<Integer, String> hashtable) {
		this.hashtable = hashtable;
	}



	@Override
	public HashMap<Integer, String> requestHandler(String request) {
		// TODO Auto-generated method stub
		return null;
	}

}
