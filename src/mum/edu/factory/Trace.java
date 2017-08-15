package mum.edu.factory;

public interface Trace {
	public void setDebug(boolean debug);
	public void debug(String message);
	public void error(String error);
}
