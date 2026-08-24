function sayHello(name, action) {
    console.log("Hello, " + name + "!");
    action();
}

function sayBye() {
    console.log("Goodbye!");
}

sayHello("Jasdhir", sayBye)