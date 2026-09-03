import { Component } from '@angular/core';
import { StudentService } from '../services/student-service.service';

@Component({
  imports: [],
  selector: 'app-student-component',
  styleUrl: './student-component.component.css',
  templateUrl: './student-component.component.html',
})
export class StudentComponent {
  students: any[] = [];

  constructor(private studentService: StudentService) {
    this.students = this.studentService.getStudentDetails();
  }
}
