package com.example.demo.MyRepo2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Students;

public interface Repository extends JpaRepository<Students, Long> {

}
