package Appendix6.CLICalculator;

import java.awt.event.FocusEvent.Cause;

public class InvalidStatementException extends Exception {
	public InvalidStatementException(String reason, String statement){
		super(reason+": "+statement);
	}
	
	public InvalidStatementException(String reason, String statement, Throwable cause) {
		super(reason+": "+statement, cause);
	}

}
