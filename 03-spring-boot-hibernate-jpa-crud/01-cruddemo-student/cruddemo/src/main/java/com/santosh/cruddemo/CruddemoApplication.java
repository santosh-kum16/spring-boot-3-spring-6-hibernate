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
			//createStudent(studentDAO);

			//createMultipleStudents(studentDAO);

			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student
		System.out.println("Creating new Student Object ... ");
		Student tempStudent = new Student("Roshan","Kumar" ,"roshan@gmail.com");

		// save the id of the saved student
		System.out.println("Saving the Student");
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. generated id: " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: " + myStudent);

	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// Create multiple Students
		System.out.println("Creating 3 new student objects ...");
		Student tempStudent1 = new Student("Chandan" , "Singh", "chandan@santosh.com");
		Student tempStudent2 = new Student("Rohit" , "Chauhan", "rohit@santosh.com");
		Student tempStudent3 = new Student("Prakash" , "Badal", "prakash@santosh.com");

		// Save the student Objects
		System.out.println("Saving all 3 students ... ");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);


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
