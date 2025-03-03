package com.duydk.cruddemo;

import com.duydk.cruddemo.dao.StudentDAO;
import com.duydk.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);

			// readStudent(studentDAO);

			// queryForStudents(studentDAO);

			// queryForStudentsByFirstName(studentDAO);

			// updateStudent(studentDAO);

			// deleteStudent(studentDAO);

			// deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("The number of deleted students: " + numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;

		System.out.println("Deleting student " + studentId);
		studentDAO.delete(studentId);
		System.out.println("Deleted");
	}

	private void updateStudent(StudentDAO studentDAO) {
		// retrieve student based on the id
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student student = studentDAO.findById(studentId);

		// change information
		System.out.println("Updating student ...");
		student.setFirstName("Scooby");

		// update the student
		studentDAO.update(student);

		// display updated student
		System.out.println("Updated student: " + student);
	}

	private void queryForStudentsByFirstName(StudentDAO studentDAO) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstName = scanner.nextLine();

		List<Student> students = studentDAO.findByFirstName(firstName);

		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> students = studentDAO.findAll();

		// display list of students
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter id: ");
		int studentId = Integer.parseInt(scanner.nextLine());
		System.out.println(studentDAO.findById(studentId));
	}

	private void createStudent(StudentDAO studentDAO) {

		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Doun", "Doe", "doun@luv2code.com");

		System.out.println("Saving student object ...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student object. Generated id: " + tempStudent.getId());

		System.out.println("Creating new student object ...");
		tempStudent = new Student("John", "Bird", "john@luv2code.com");

		System.out.println("Saving student object ...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student object. Generated id: " + tempStudent.getId());

		System.out.println("Creating new student object ...");
		tempStudent = new Student("Loo", "Ange", "loo@luv2code.com");

		System.out.println("Saving student object ...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student object. Generated id: " + tempStudent.getId());

		System.out.println("Creating new student object ...");
		tempStudent = new Student("Nana", "Anne", "nana@luv2code.com");

		System.out.println("Saving student object ...");
		studentDAO.save(tempStudent);

		System.out.println("Saved student object. Generated id: " + tempStudent.getId());
	}

}
