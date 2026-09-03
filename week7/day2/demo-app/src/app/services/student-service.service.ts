import { Injectable, Service } from '@angular/core';

@Injectable({
    providedIn: 'root'
})
export class StudentService {
    getStudentDetails () {
        return [
            {
                id: 1,
                name: 'John Doe',
                age: 20,
                major: 'Computer Science',
            },
            {
                id: 2,
                name: 'Jane Smith',
                age: 22,
                major: 'Mathematics',
            },
            {
                id: 3,
                name: 'Michael Johnson',
                age: 21,
                major: 'Physics',
            },
        ];
    }
}
