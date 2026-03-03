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

		repo.save(s1); //Create table if not there then save data in table
//		repo.save(s2); // This also updates the value if same primary key is found
//		repo.save(s3);
		System.out.println(repo.findAll()); // Fetch all records from the table
		System.out.println(repo.findById(2).orElse(new Student())); // Fetch record By ID and return null class if not found

		System.out.println(repo.findByMarks(110)); //Custom Query

		System.out.println(repo.findByMarksOrNameContaining(1001,"Adi")); //Custom Query

		System.out.println(repo.findByNames("Adit","Anukriti")); // Custom Query using @Query

//		repo.delete(s1); //This delete the record by Primary Key
	}

}
