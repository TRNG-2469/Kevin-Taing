// class Employee extends Person {
//     private static headcount: number = 0;
//
//     constructor(
//         ssn: string,
//         firstName: string,
//         lastName: string,
//         private jobTitle: string) {
//         super(ssn, firstName, lastName);
//         Employee.headcount++;
//     }
//
//     describe(): string {
//         return super.describe() + `I'm a ${this.jobTitle}`;
//     }
//
//     public static getHeadcount() {
//         return Employee.headcount;
//     }
// }
//
// let employee = new Employee('123-45-6789', 'John', 'Doe', 'Front-end Developer');
// console.log(employee.getFullName());
// console.log(employee.describe());