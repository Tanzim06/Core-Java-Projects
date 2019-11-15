package Appendix6.CLICalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws UnableToPerformCalculationException {
		
		MathProcessable[] handlers= {
				new Adder(),
				new PowerOf(),
				new Subtracter(),
				new Divider(),
				new Multiplier()
		};
		
		CalculatorEngine engine= new CalculatorEngine(handlers);
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please type your command: ");
		String command;
		
		while(!(command=scanner.nextLine()).equals("quit")) {
			try {
				String process= engine.process(command);
				System.out.println(process);
			}catch(InvalidStatementException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
