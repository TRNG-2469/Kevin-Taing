import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Welcome } from './welcome/welcome.component';
import { Onewaydb } from './onewaydb/onewaydb.component';
import { Twowaydb } from './twowaydb/twowaydb.component';
import { DirectiveDemo } from './directive-demo/directive-demo.component';
import { PipeDemo } from './pipe-demo/pipe-demo.component';
import { Parent } from './parent/parent.component';
import { Child } from './child/child.component';
import { StudentComponent } from './student-component/student-component.component';
import { UserComponent } from './user-component/user-component.component';

@Component({
  imports: [RouterOutlet, Welcome, Onewaydb, Twowaydb, DirectiveDemo, PipeDemo, Parent, Child, StudentComponent, UserComponent],
  selector: 'app-root',
  styleUrl: './app.component.css',
  templateUrl: './app.component.html',
})
export class App {
  myApp = "Demo App";
}
