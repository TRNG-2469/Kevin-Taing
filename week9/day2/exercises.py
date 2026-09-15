# Exercise 1
try:
    number1 = int(input("Enter a number :"))
    number2 = int(input("Enter a number :"))
    print("Result : ", number1 / number2)
except ValueError:
    print("Something went wrong")
except ZeroDivisionError:
    print("Error : Division by zero is not allowed")

# Exercise 2
list = [1, 2, 3, 4, 5]
try:
    index = int(input("Enter an index :"))
    print("Element at index ", index, " is ", list[index])
except IndexError:
    print("Error : Index out of range")

# Exercise 3
dict = {"name": "John", "age": 30, "city": "New York"}
try:
    key = input("Enter a key :")
    print("Value for key ", key, " is ", dict[key])
except KeyError:
    print("Error : Key not found in dictionary")