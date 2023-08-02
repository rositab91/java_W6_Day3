package rositabongiovanni.java_W6_Day3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import rositabongiovanni.java_W6_Day3.enum_.StationType;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Station {
	private int id;
	private String description;
	private StationType type;
	private int occupants;
	private Building building;
}
