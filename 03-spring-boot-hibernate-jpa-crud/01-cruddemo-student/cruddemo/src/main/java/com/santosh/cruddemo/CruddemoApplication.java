package com.santosh.cruddemo;

import com.santosh.cruddemo.dao.StudentDAO;
import com.santosh.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	/*
	*
	*  Below Code CommandLineRunner From the Spring Boot Framework Defining a new Bean.
	* */

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		/* Short-cut notation of Lambda Expression providing an Implementation of CommandLineRunner Interface
		 *
		 *  Execute after the Spring Beans have been loaded
		 */
		return runner ->{
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {

		//Create student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Harsh" , "Yadav", "harsh@santosh.com");

		//save the student object
		System.out.println("Saving the student ... ");
		studentDAO.save(tempStudent);

		//display id of the student
		System.out.println("Saved student. Generated id: "+ tempStudent.getId());


	}

}
