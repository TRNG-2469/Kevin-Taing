import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  imports: [],
  templateUrl: './child.component.html',
  styleUrl: './child.component.css',
})
export class Child {
  @Input()
  student : string = '';

  @Output()
  selectedStudent = new EventEmitter<string>();

  selectStudent() {
    alert('Selected Student : ' + this.student);
    this.selectedStudent.emit(this.student);
  }
}