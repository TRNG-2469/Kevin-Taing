import { Component } from '@angular/core';
import { DatePipe, LowerCasePipe, SlicePipe, UpperCasePipe } from '@angular/common';

@Component({
  imports: [UpperCasePipe, LowerCasePipe, DatePipe, SlicePipe],
  selector: 'app-pipe-demo',
  styleUrl: './pipe-demo.component.css',
  templateUrl: './pipe-demo.component.html',
})
export class PipeDemo {
  pipeName = 'Angular Pipe Demo';
  today = new Date();
  userName = 'John Doe';
}
