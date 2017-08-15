package mum.edu.factory;

public class TestMain {
	public static void main(String[] args) {
		TraceDebugger traceDebugger = Debugger.getDebugger();
		Trace console = traceDebugger.getTracer("trace.log");
		Trace fileConsole = traceDebugger.getTracer("console");

	}

}
