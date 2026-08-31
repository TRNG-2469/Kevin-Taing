"use strict";
class Employee extends Person {
    jobTitle;
    constructor(ssn, firstName, lastName, jobTitle) {
        super(ssn, firstName, lastName);
        this.jobTitle = jobTitle;
    }
}
