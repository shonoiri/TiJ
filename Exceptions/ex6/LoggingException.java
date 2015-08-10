package ex6;

/*Exercise 6: (1) Create two exception classes, each of which performs its own logging
automatically. Demonstrate that these work.*/

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

@SuppressWarnings("serial")
class LoggingException1 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException");

	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

@SuppressWarnings("serial")
class LoggingException2 extends Exception {
	private static Logger logger = Logger.getLogger("LoggingException2");

	public LoggingException2() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

 class LoggingException {
	@SuppressWarnings("unused")
	private static void main(String[] args) {
		try {
			throw new LoggingException1();
		} catch (LoggingException1 e) {
			System.err.println("Caught " + e);
		}
		try {
			throw new LoggingException2();
		} catch (LoggingException2 e) {
			System.err.println("Caught " + e);
		}
	}
}