package com.app.Services;

import java.util.List;
import java.util.Optional;

import com.app.Entities.Event;
import com.app.customexeption.CustomException;
import com.app.dto.CreateDTO;

public interface ITaskService {
	Event AddTask(Event t) throws CustomException;
	
	List<CreateDTO> GetDetails();
	
	Optional<Event> DeleteById(Long id);
	
	String UpdateTask(Event t);
	
	List<Event> FetchDetails(String city);

}
