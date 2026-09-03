import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'greeting',
})
export class GreetingPipe implements PipeTransform {
  transform(value: string): string {
    return "Hello, " + value + ". Welcome to Angular Pipes!";
  }
}
