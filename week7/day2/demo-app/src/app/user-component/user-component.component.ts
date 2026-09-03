import { Component } from '@angular/core';
import { UserService } from '../services/user-service.service';
import { JsonPipe } from '@angular/common';

@Component({
  imports: [JsonPipe],
  selector: 'app-user-component',
  styleUrl: './user-component.component.css',
  templateUrl: './user-component.component.html',
})
export class UserComponent {
  users: any[] = [];
  constructor(private userService: UserService) {}

  ngOnInit() {
    this.userService.getUsers().subscribe((data: any) => {
      this.users = data;
      console.log(this.users);
    });
  }
}
