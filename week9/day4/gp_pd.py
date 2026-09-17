employees = pd.DataFrame({
    "name": [
        "Alice",
        "Bob",
        "Charlie",
        "David"
    ],
    "department": [
        "IT",
        "HR",
        "IT",
        "HR"
    ],
    "salary": [
        50000,
        45000,
        60000,
        48000
    ]
})

print(employees.groupby("department")["salary"]).count()