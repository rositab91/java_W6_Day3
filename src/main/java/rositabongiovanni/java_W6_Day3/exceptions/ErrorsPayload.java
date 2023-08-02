package rositabongiovanni.java_W6_Day3.exceptions;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorsPayload {
	private String message;
	private Date timestamp;
	private int internalCode;
}
