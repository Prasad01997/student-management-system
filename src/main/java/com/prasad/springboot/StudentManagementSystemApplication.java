package com.prasad.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prasad.springboot.entity.Student;
import com.prasad.springboot.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Student student1 = new Student("Prasad", "Patil","prasad@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("Swara", "Pawar","swara@gmail.com");
		studentRepository.save(student2);
				
		*/
	}

}