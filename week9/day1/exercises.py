# Exercise 1
name = "Hello"
age = "World"
city = "!"

print(f"My name is {name}")
print(f"I am {age} years old.")
print(f"I live in {city}")

# Exercise 2
number_one = 10
number_two = 5

print(number_one + number_two)
print(number_one - number_two)
print(number_one * number_two)
print(number_one / number_two)
print(number_one % number_two)

# Exercise 3
number = 17
if number % 2 == 0:
    print(f"{number} is even")

# Exercise 4
age = 20
if age >= 65:
    print("Senior")
elif age >= 18:
    print("Adult")
elif age >= 13:
    print("Teenager")
else:
    print("Child")

# Exercise 5
mark = 85
if mark >= 90:
    print("A")
elif mark >= 80:
    print("B")
elif mark >= 70:
    print("C")
elif mark >= 60:
    print("D")
else:
    print("F")

# Exercise 6
for number in range(2, 101, 2):
    print(number)

# Exercise 7
number = 4
for i in range(1, 11):
    print(number * i)

# Exercise 8
sum = 0
for i in range(1, 101):
    sum += i
print(sum)

# Exercise 9
countdown = 10
while countdown > 0:
    print(countdown)
    countdown -= 1
print("Blast off!")