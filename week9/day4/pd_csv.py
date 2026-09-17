import pandas as pd

students = pd.read_csv("students.csv")
print(students)

print(students.groupby("age").sum())