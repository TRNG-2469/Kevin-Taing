import { Component } from '@angular/core';
import { NgClass } from '@angular/common';

@Component({
  imports: [NgClass],
  selector: 'app-directive-demo',
  styleUrl: './directive-demo.component.css',
  templateUrl: './directive-demo.component.html',
})
export class DirectiveDemo {
  isLoggedIn: boolean = true;
  students = [
    {name: 'John', age: 20},
    {name: 'Jane', age: 22},
    {name: 'Bob', age: 19}
  ]
  isActive = false;
}

