var hello = () => {console.log("Hello, World!")};

hello();

const add = (a, b) => {return a + b};

console.log(add(5, 10));

function sum(...args) {
    console.log(args);
}

sum(10, 20);
sum(10, 20, 30);
sum(10, 20, 30, 40);

const numbers = [1, 2, 3, 4, 5];