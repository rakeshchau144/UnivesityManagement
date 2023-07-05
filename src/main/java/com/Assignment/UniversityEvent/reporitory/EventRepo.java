package com.Assignment.UniversityEvent.reporitory;

import com.Assignment.UniversityEvent.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends CrudRepository<Event, Integer> {
}
