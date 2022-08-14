package com.prasad.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.prasad.springboot.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
