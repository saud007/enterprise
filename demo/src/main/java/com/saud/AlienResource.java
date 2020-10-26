package com.saud;
import java.util.ArrayList;
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

@RestController
public class AlienResource {

	@Autowired
	AlienRepository repo;
	
	//@RequestMapping("alien")
	@GetMapping("aliens")
	public List<Alien> getAliens()
	{
		List<Alien> aliens = (List<Alien>)repo.findAll();
		return aliens;
	}
	
	@GetMapping("/alien/{id}")
	public Optional<Alien> getAlien(@PathVariable("id") int id)
	{
		return repo.findById(id);
	}
	
	@PostMapping("alien")
	public Alien getAlien(@RequestBody Alien a1)
	{
		repo.save(a1);
		return a1;
	}
	
	@DeleteMapping("alien/{id}")
	public String deleteAlien(@PathVariable int id)
	{
		Alien a = repo.getOne(id);
		repo.delete(a);
		return "200 ok";
	}
	
	@PutMapping(path ="alien")
	public Alien saveOrUpdateAlien (@RequestBody Alien a1)
	{
		repo.save(a1);
		return a1;
	}
}
