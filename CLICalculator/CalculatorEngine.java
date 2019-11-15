package Appendix6.CLICalculator;


public class CalculatorEngine {
	private MathProcessable[] handlers;
	
	public CalculatorEngine(MathProcessable[]handlers) {
		this.handlers= handlers;
	}
	
	public String process(String statement) throws InvalidStatementException, UnableToPerformCalculationException{
		// IN: add 1.0 2.0
		//out: 1.0,2.0=3.0
		
		String[] parts= statement.split(MathProcessable.SEPARATOR);
		if(parts.length!=3) {
			throw new InvalidStatementException("Incorrect number of fields", statement);
		}
		
		String keyword= parts[0];// add
		MathProcessable theHandler= null;
		for(MathProcessable handler: handlers) {
			if(keyword.equalsIgnoreCase(handler.getKeyword())) {
				theHandler= handler;
				break;
			}
		}
		if(theHandler==null) {
			return "Command not found";
		}
		
		double leftVal= Double.parseDouble(parts[1]); // 1.0
		double rightVal= Double.parseDouble(parts[2]);// 2.0
		double result;
		result= theHandler.doCalculation(leftVal, rightVal);
		return String.valueOf(leftVal)+' '
				+theHandler.getSymbol()+' '
				+rightVal+" = "+result;
	}
}
