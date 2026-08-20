package com.rev.rest.repositories;

import com.rev.rest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findbyEmail(String email);
    List<Student> findByCourse(String course);
}
