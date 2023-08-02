package rositabongiovanni.java_W6_Day3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Booking {
	private User user;
	private Station station;
}
