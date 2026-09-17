from flask import Flask

app = Flask(__name__)

@app.route("/")
def home():
    return "Hello From Flask !"

@app.route("/about", method = ["GET"])
def about():
    return "About Me Page..."

if __name__ == "__main__":
    app.run(debug = True)