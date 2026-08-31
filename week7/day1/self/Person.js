"use strict";
class Person {
    ssn;
    firstName;
    lastName;
    constructor(ssn, firstName, lastName) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    getFullName() {
        return `${this.firstName} ${this.lastName}`;
    }
}
const person = new Person("123-45-6789", "John", "Doe");
console.log(person.getFullName());
