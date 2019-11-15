package Appendix7.MorseCodeTransletor;


public class MorseCodeTranslator {
	public MorseString toMorseString(String text) {
		return MorseString.parse(text);
	}
	
	public String toText(String morseCode) {
		MorseString morseString= new MorseString(morseCode);
		return morseString.asText();
	}

}
