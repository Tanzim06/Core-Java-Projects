package Appendix7.MorseCodeTransletor;

import java.util.Scanner;

public class MorseStringTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		MorseCodeTranslator translator= new MorseCodeTranslator();
		System.out.println("Select translation option:");
		System.out.println("1: English to Morsecode");
		System.out.println("2: Morsecode to English");
		System.out.print("Enter Choice: ");
		int input= Integer.parseInt(sc.nextLine());
		if(input==1) {
		System.out.print("Enter English: ");
		String Enginput= sc.nextLine();
		MorseString toMorse=translator.toMorseString(Enginput);
		System.out.println(toMorse);
		}else if(input==2){
		System.out.print("Enter Morsecode: ");
		String Morseinput= sc.nextLine();
		String text= translator.toText(Morseinput);
		System.out.println(text);
		sc.close();
	}
}
}
