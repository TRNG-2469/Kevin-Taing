import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  imports: [FormsModule],
  selector: 'app-twowaydb',
  styleUrl: './twowaydb.component.css',
  templateUrl: './twowaydb.component.html',
})
export class Twowaydb {
  firstName: string = "Jasdhir"
}
