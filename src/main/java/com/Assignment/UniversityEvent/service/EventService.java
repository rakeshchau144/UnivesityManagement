package com.Assignment.UniversityEvent.service;

import com.Assignment.UniversityEvent.reporitory.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    EventRepo eventRepo;
}
