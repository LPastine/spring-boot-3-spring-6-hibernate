package com.lpastine.cruddemo;

import com.lpastine.cruddemo.dao.StudentDAO;
import com.lpastine.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// 3) Update main app
@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		// Create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul", "Doe", "paul@gmail.com");

		// Save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// Display id of the save student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}
