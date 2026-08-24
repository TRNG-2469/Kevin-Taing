function downloading(done) {
    console.log("Downloading...");
    setTimeout(
        function(){done();},
        3000
    )
}



function showMessage() {
    console.log("Download complete")
}

downloading(showMessage);