function Logger(constructor: Function) {
    console.log('Logging...');
}

@Logger
class Person {
    name: string = 'Jasdhir';

    constructor() {
        console.log(`Hello TypeScript! ${this.name}`);
    }
}

let person = new Person();