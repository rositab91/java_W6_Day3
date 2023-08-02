package rositabongiovanni.java_W6_Day3.exceptions;

@SuppressWarnings("serial")
public class UnknownLanguage extends RuntimeException {

	public UnknownLanguage(String lang) {
		super(lang + " is not a supported language / lingua non supportata! Try '/en' or '/it' ");
	}
}
