package Appendix6.CLICalculator;

public interface MathProcessable {
	String SEPARATOR=" ";
	String getKeyword();//add
	char getSymbol();//+
	double doCalculation(double leftVal, double rightVal) throws UnableToPerformCalculationException;
}
