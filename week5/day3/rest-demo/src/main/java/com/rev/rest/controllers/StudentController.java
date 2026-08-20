package com.rev.rest.controllers;

import com.rev.rest.exceptions.StudentNotFoundException;
import com.rev.rest.model.Student;
import com.rev.rest.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) throws StudentNotFoundException {
        Student student = studentService.getStudentById(id);
        if(student == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(student);
    }

    @PostMapping("/students")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student studentCreated = studentService.addStudent(student);
        return ResponseEntity.status(201).body(studentCreated);
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        return studentService.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("/students/{id}")
    public boolean deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}
