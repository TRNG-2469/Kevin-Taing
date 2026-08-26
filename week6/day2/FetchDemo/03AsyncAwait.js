async function getTodos(id) {
    const response = await fetch("https://jsonplaceholder.typicode.com/todos/${id}");
    const json = await response.json();
    console.log(json);
}

getTodos(1);