package Appendix6.CLICalculator;

public class UnableToPerformCalculationException extends Exception {
	
	public UnableToPerformCalculationException(String reason){
		super(reason);
	}
}
