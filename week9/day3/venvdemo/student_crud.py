from flask import Flask, jsonify, request

app = Flask(__name__)

students=[
    {
        "id":1,
        "name":"Alice",
        "age":20
    },
    {
        "id":2,
        "name":"Bob",
        "age":21
    }
]

@app.route("/students", methods = ["GET"])
def get_students():
    if request.args:
        age = int(request.args.get("age"))
        stu_list = []
        for student in students:
            if student["age"] == age:
                stu_list.append(student)
        return jsonify(stu_list)
    else:
        return jsonify(students)

@app.route("/students/<int:student_id>", methods = ["GET"])
def get_student(student_id):
    for student in students:
        if student["id"] == student_id:
            return jsonify(student)
    return jsonify({
        "error" : "Student Not Found"
    }),404

@app.route("/students", methods = ["POST"])
def create_student():
    new_student = request.get_json()

    if not new_student:
        return jsonify({"error": "Request Body is required"}), 400

    students.append(new_student)
    return jsonify(new_student), 201

@app.route("/student/<int:student_id>", methods = ["PUT"])
def update_student(student_id):
    updated_student = request.get_json()
    for student in students:
        if student["id"] == student_id:
            student["name"] = updated_student.get( "name", student["name"] ) 
            student["age"] = updated_student.get( "age", student["age"] ) 
            return jsonify(student), 200
    return jsonify({
        "error" : "Student Not Found"
    }),404

@app.route("/student/<int:student_id>", methods = ["DELETE"])
def delete_student(student_id):
    for student in students:
        if student["id"] == student_id:
            students.remove(student)
            return jsonify({ "message": "Student deleted successfully" }), 200
    return jsonify({
        "error" : "Student Not Found"
    }),404

if __name__ == "__main__":
    app.run(debug = True)