const myPost = {
  userId: 101,
  id: 101,
  title: "Creating a post using fetch",
  body: "Creating a post using fetch"
}

fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST", 
    body: JSON.stringify(myPost),
    header: {
        "Content-type": "application/json; charset = UTF-8"
    }
}).then(response => response.json)
.then(json => console.log(json))
.catch(error => console.log("Error: " + error));