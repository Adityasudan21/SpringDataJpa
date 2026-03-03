package com.springboot.springDataJpa.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    // This is interface and it extends to JpaRepository which has 2 arguments
    // First one is the class name second one the Datatype of Primary Key (rollno in this case)

    //This gives all the functions that we need like CRUD operations

    // Custom Queries

    public List<Student> findByMarks(int marks);  // DSL will generate the custom query just based on the name

    // For complex queries also we could do this by stacking up keyword one after another

    public List<Student> findByMarksOrNameContaining(int marks,String name);

    // Using @Query annotation to write veru complex query
    @Query("select s from Student s where s.name=?1 OR s.name=?2")
    public List<Student> findByNames(String name1, String name2);
}
