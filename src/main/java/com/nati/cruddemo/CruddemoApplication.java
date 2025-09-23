package com.nati.cruddemo;

import com.nati.cruddemo.dao.StudentDAO;
import com.nati.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.beans.BeanProperty;

@SpringBootApplication
public class CruddemoApplication {
    public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
  @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return  runner ->{
//            createStudent(studentDAO);
//            createMultipleStudent(studentDAO);
            readStudent(studentDAO);
        };
  }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Creating New Student ..");
        Student student2 = new Student("Pico","Song","Picolozelalem@gmail.com");
        System.out.println("Saving Student " + student2);
        studentDAO.save(student2);
        int theId = student2.getId();
        System.out.println("Reading Student " + theId);
        System.out.println("Retriving the student with this " + theId);
        Student theStudent = studentDAO.findById(theId);
        System.out.println("Found the student with this " + theStudent);

    }

    private void createMultipleStudent(StudentDAO studentDAO) {
        System.out.println("Creating 3 New Student ..");
        Student student1 = new Student("Tsega","Abedella","TsegaAbdella@gmail.com");
        Student student2 = new Student("Picolo","Song","Picolozelalem@gmail.com");
        Student student3 = new Student("Mimo","Legesse","Mimozelalem@gmail.com");

        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating New Student ..");
        Student student = new Student("Nathnael","Zelalem","nathnaelzelalem@gmail.com");
        System.out.println("Saving Student " + student);
        studentDAO.save(student);
        System.out.println("Saved Student Generated Id:" + student.getId());
    }
}
