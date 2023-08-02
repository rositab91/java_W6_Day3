package rositabongiovanni.java_W6_Day3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import rositabongiovanni.java_W6_Day3.exceptions.UnknownLanguage;
import rositabongiovanni.java_W6_Day3.services.BookingService;

@RestController
@RequestMapping("/reservations")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@GetMapping("/{lang}")
	public String getMessage(@PathVariable String lang, @RequestParam String d) {
		return bookingService.getInfoMessage(lang).orElseThrow(() -> new UnknownLanguage(lang));
	}
	}

