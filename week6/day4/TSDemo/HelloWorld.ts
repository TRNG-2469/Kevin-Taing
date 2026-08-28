let firstName: string = "Jasdhir";
console.log(`Hello TypeScript! ${firstName} `);

let names: string[] = ['John', 'Jane', 'Peter', 'David', 'Mary'];
for(let i = 0; i < names.length; i++) {
    console.log(`Hello ${names[i]}!`);
}

let greeting: (name: string) => string;
greeting = function(name: string) {
    return `Hi ${name}`;
}