package rositabongiovanni.java_W6_Day3.exceptions;

@SuppressWarnings("serial")
public class NotFoundException extends RuntimeException {

	public NotFoundException(int id) {
super("Item with id " + id + " not found!");
	}
}

