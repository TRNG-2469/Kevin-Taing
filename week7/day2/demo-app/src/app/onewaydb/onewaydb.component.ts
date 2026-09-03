import { Component } from '@angular/core';

@Component({
  imports: [],
  selector: 'app-onewaydb',
  styleUrl: './onewaydb.component.css',
  templateUrl: './onewaydb.component.html',
})
export class Onewaydb {
  appName = "One Way Databinding";
  imageUrl = 'https://angular.io/assets/images/logos/angular/angular.svg';

  showMessage() {
    alert("Hello from One Way Databinding");
  }
}