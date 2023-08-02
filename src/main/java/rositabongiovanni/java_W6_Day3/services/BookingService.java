package rositabongiovanni.java_W6_Day3.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.Data;
import rositabongiovanni.java_W6_Day3.entities.Booking;
import rositabongiovanni.java_W6_Day3.entities.Building;
import rositabongiovanni.java_W6_Day3.entities.Station;
import rositabongiovanni.java_W6_Day3.entities.User;
import rositabongiovanni.java_W6_Day3.enum_.StationType;

@Data
@Service

public class BookingService {

	private List<Booking> reservations = new ArrayList<>(List.of(
			new Booking(
					new User("Miriam", "Liparota"),
					new Station(1, "coworking", StationType.OPEN_SPACE, 10, new Building(1, "Block B", "Street 75", "Toronto")))
	));

	private Map<String, String> reservationsInfoMessageMap = Map.of("it",
			"Queste sono le regole per le prenotazioni per le nostre postazioni:", "en",
			"Here, our booking rules for our spaces:");

	public Optional<String> getInfoMessage(String lang) {
		return Optional.ofNullable(reservationsInfoMessageMap.get(lang));
	}
}

