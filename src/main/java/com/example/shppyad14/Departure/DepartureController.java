package com.example.shppyad14.Departure;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/departures")
public class DepartureController {
    private final List<Departure> departures = new ArrayList<>();

    @GetMapping("")
    public ResponseEntity<List<Departure>> getAllDepartures() {
        return ResponseEntity.ok(departures);
    }

    @PostMapping("")
    public ResponseEntity<Departure> createDeparture(@RequestBody Departure departure) {
        departures.add(departure);
        return ResponseEntity.ok(departure);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDeparture(@PathVariable int id) {
        if (id >= departures.size()) {
            return ResponseEntity.badRequest().body("Invalid id");
        }
        departures.remove(id);
        return ResponseEntity.ok("Departure deleted successfully");
    }
}