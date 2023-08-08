package com.cotiviti.vemployee.controllers;

import com.cotiviti.vemployee.model.Event;
import com.cotiviti.vemployee.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("/event")
    public ResponseEntity<List<Event>> getAllEvent(){
        return ResponseEntity.ok(eventService.getAllEvent());
    }
}
