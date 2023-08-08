package com.cotiviti.vemployee.service;

import com.cotiviti.vemployee.model.Event;
import com.cotiviti.vemployee.repo.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvent(){
        return eventRepository.findAll();
    }
}
