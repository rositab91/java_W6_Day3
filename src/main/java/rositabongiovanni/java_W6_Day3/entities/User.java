package rositabongiovanni.java_W6_Day3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class User {
	private int id;
	private String name;
	private String lastName;
	private String email;

	public User(String name, String lastName) {
 this.name = name;
 this.lastName = lastName;
 }
}
