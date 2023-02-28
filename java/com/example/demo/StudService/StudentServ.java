package com.example.demo.StudService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entity.Students;
import com.example.demo.MyRepo2.Repository;

@Service
public class StudentServ {

	@Autowired
	private Repository repo;

	// addEmployee
	public Students addemployee(Students obj) {
		return repo.save(obj);
	}

	// getEmployee
	public List<Students> getemployee() {
		List<Students> arr = new ArrayList<>();
		arr = repo.findAll();
		return arr;
	}
	
	//deleteById  
	public void deleteById(Long id) {
		repo.deleteById(id);
	}
	
	//getById
	public Optional<Students> findById(Long id) {
		Optional<Students> emp = repo.findById(id);
		return emp;
	}
	
	//update
	public Students update(Long id,Students e) {
		return repo.saveAndFlush(e);
	}

}
