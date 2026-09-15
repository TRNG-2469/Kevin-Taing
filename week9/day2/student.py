class Student:
    course = "Learning Python"

    def __init__(self):
        self.name = name
        self.age = age

    def introduce(self):
        print(f"My name is {self.name}")
        print(f"My age is {self.age}")
        print(f"Course in progress {self.course}")

    def __str__(self):
        return (f"Name : {self.name} , Age : {self.age}")

    def __repr__(self):
        return f"Student : ({self.name!r})"

student1 = Student("Tyson", 25)
print(student1.introduce())

student2 = Student("Hamza", 25)
print(student2.introduce())