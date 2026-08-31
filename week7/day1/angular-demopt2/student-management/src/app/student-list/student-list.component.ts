import { Component } from '@angular/core';
import { StudentCardComponent } from '../student-card/student-card.component';

@Component({
  selector: 'app-student-list',
  standalone: true,
  imports: [StudentCardComponent],   // ← Import so the template can use <app-student-card>
  templateUrl: './student-list.component.html',
  styleUrl: './student-list.component.css'
})
export class StudentListComponent {
  sectionTitle = 'All Students';
}