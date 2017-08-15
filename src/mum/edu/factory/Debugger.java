package mum.edu.factory;

public class Debugger implements TraceDebugger{
	
	public static Debugger debugger = new Debugger();
	private Debugger(){}
	

	public static Debugger getDebugger() {
		return debugger;
	}
	@Override
	public Trace getTracer(String tracingType){
		if(tracingType.equalsIgnoreCase("trace.log"))
			return new FileTrace();
		else if(tracingType.equalsIgnoreCase("console"))
			return new ConsoleTrace();
			System.out.println("invalid input");
			return null;
	}

}
