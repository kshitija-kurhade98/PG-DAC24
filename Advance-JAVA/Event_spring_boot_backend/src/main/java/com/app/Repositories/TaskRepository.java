package com.app.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Event;


public interface TaskRepository extends JpaRepository<Event, Long> {
	List<Event> findAllByCity(String city);

}
