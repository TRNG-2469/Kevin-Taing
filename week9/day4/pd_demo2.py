import pandas as pd

students = pd.DataFrame({
    "name": ["Alice", "Bob", "Charlie"],
    "age": [20, 21, 22],
    "marks": [85, 75, 92]
})

print(students.columns)
print(students.info)
print(students.describe())
print("*" * 30)
print(students[["name", "marks"]])
print("-" * 30)
print(students[students["marks"] >= 80])
result = students[(students["marks"] >= 80) | (students["age"] > 20)]
print("$" * 30)
students["grade"] = students["marks"] >= 80
print(students)
print("#" * 30)
students["final_marks"] = students["marks"] + 5
print(students)