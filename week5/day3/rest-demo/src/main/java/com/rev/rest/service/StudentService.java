package com.rev.rest.service;

import com.rev.rest.exceptions.StudentNotFoundException;
import com.rev.rest.model.Student;
import com.rev.rest.repositories.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) throws StudentNotFoundException {
        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(int id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
        existingStudent.setName(updatedStudent.getName());
        existingStudent.setEmail(updatedStudent.getEmail());
        existingStudent.setCourse(updatedStudent.getCourse());
        return studentRepository.save(existingStudent);
    }

    public boolean deleteStudent(int id) {
        if(studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        } else {
            throw new StudentNotFoundException(id);
        }
    }
}
