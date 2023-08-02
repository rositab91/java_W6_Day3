package rositabongiovanni.java_W6_Day3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Building {
	private int id;
	private String name;
	private String address;
	private String city;
}
