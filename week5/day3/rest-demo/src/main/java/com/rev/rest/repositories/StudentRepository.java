package com.rev.rest.repositories;

import com.rev.rest.model.Student;
import org.hibernate.annotations.processing.SQL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
//    @SQL("SELECT * FROM students WHERE email = ?1")
//    Student findbyEmail(String email);
//    @SQL("SELECT * FROM students WHERE course = ?1")
//    List<Student> findByCourse(String course);
}
