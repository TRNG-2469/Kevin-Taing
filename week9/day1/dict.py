student = {
    "name": "Jasdhir",
    "age": 45,
    "marks": 85
}

print(student["name"])
print(student.get("age"))

student["city"] = "Plano"

print(student)

print(student.items())
print(student.keys())
print(student.values())

for key in student:
    print(key)

for value in student:
    print(value)

for key, value in student.items():
    print(key, " : ", value)