package Appendix6.CLICalculator;

public class PowerOf extends CalculateBase implements MathProcessable {

	@Override
	public String getKeyword() {
		
		return "power";
	}

	@Override
	public char getSymbol() {
		
		return '^';
	}

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		setLeftVal(leftVal);
		setRightVal(rightVal);
		calculate();
		
		return getResult();
	}

	@Override
	public void calculate() {
		
		double pow= Math.pow(getLeftVal(), getRightVal());
		setResult(pow);
		
	}
	
}
