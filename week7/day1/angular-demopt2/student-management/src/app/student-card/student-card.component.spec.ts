import { Component } from '@angular/core';

@Component({
  selector: 'app-student-card',
  standalone: true,
  imports: [],
  templateUrl: './student-card.component.html',
  styleUrl: './student-card.component.css'
})
export class StudentCardComponent {
  studentName = 'Alice Johnson';
  studentId = 'STU-001';
  course = 'Computer Science';
  year = 2;
}