import { Component } from '@angular/core';
import { Child } from '../child/child.component';

@Component({
  selector: 'app-parent',
  imports: [Child],
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css',
})
export class Parent {
  studentName : string = 'John Doe';

  selectedStudent: string = '';

  receiveStudent(student: string) {
    this.selectedStudent = student;
    alert('Received Student : ' + this.selectedStudent);
  }
}
