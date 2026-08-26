// const promise = new Promise(function(resolve, reject) {
//     let success = false;
//     if(success) {
//         resolve("The operation was successfull");
//     } else {
//         reject("The operation failed");
//     }
// });

// promise.then(function(message) {
//     console.log("Success: " + message);
// }).catch(function(message) {
//     console.log("Error: " + message);
// })



function checkUser(loggedIn) {
    return new Promise(function(resolve, reject) {
        if (loggedIn) {
            resolve("User is logged in");
        } else {
            reject("User is not logged in");
        }
    });
}


checkUser(true).then(function(message) {
    console.log("Success: " + message);
}).catch(function(message) {
    console.log("Error: " + message);
})
