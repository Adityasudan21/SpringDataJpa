package com.springboot.springDataJpa;

import com.springboot.springDataJpa.model.Student;
import com.springboot.springDataJpa.model.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class, args);

		StudentRepo repo=context.getBean(StudentRepo.class);

		Student s1=context.getBean(Student.class);
		Student s2=context.getBean(Student.class);
		Student s3=context.getBean(Student.class);

		s1.setRollno(1);
		s1.setName("Aditya");
		s1.setMarks(100);


		s2.setRollno(2);
		s2.setName("Anukriti");
		s2.setMarks(90);

		s3.setRollno(3);
		s3.setName("Anushka");
		s3.setMarks(110);

		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
	}

}
