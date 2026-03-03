package com.springboot.springDataJpa.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    // This is interface and it extends to JpaRepository which has 2 arguments
    // First one is the class name second one the Datatype of Primary Key (rollno in this case)

    //This gives all the functions that we need like CRUD operations
}
