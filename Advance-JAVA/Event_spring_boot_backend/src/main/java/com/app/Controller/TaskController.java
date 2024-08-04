package com.app.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.Event;
import com.app.Services.ITaskService;
import com.app.customexeption.CustomException;
import com.app.dto.CreateDTO;

@RestController
@RequestMapping("/Event")
public class TaskController {
	
	@Autowired
	private ITaskService service;
	
	@PostMapping("/add")
	public Event AddTask(@RequestBody Event t)
	{
		Event t1=null;
		try {
			t1=service.AddTask(t);
			
		}
		catch(CustomException e)
		{
			System.out.println(e.getMessage());
		}
		return t1;
	}
	
	@GetMapping("/createdto")
	public List<CreateDTO> GetCreateDto()
	{
		return service.GetDetails();
	}
	
	@DeleteMapping("/{id}")
	public Optional<Event> DeleteById(@PathVariable Long id)
	{
	   return service.DeleteById(id);
	}
	
	@PutMapping("/update")
	public String Update(@RequestBody Event t)
	{
	  return service.UpdateTask(t);	
	}
	
	@GetMapping("/{city}")
	public List<Event> Fetch(@PathVariable String city)
	{
		return service.FetchDetails(city);
	}

}
