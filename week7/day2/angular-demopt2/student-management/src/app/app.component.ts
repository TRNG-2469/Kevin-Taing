import { Component } from '@angular/core';
import { NavbarComponent } from './navbar/navbar.component';
import { StudentListComponent } from './student-list/student-list.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [NavbarComponent, StudentListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  // AppComponent is now purely a layout shell
}