def greet():
    print("Welcome to Python")

def square(num):
    return num * num

def is_even(num):
    return num % 2 == 0

def calculate_total(numbers):
    total = 0
    for number in numbers:
        total += number
    return total

def name_and_age(name, age):
    return f"My name is {name} and I am {age} years old."