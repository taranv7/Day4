package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Students;
import com.example.demo.StudService.StudentServ;

@RestController
public class StudController
{
	@Autowired
	private StudentServ empserv;
	
	@GetMapping("/show")
	public List<Students> showStudents(){
		return empserv.getemployee();
	}
	
	@PostMapping("/add")
	public Students addStudent(@RequestBody Students obj) {
		return empserv.addemployee(obj);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delStudent(@PathVariable Long id) {
		empserv.deleteById(id);
	}
	
	@GetMapping("/show/{id}")
	public Optional<Students> findById(@PathVariable Long id) {
		return empserv.findById(id);
	}
	
	@PutMapping("/update/{id}")
	public Students update(@PathVariable Long id,@RequestBody Students e){
		return empserv.update(id,e);
	}
	
}