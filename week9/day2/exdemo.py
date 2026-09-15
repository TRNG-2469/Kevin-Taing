try:
    number = int(input("Enter a number :"))
    result = 10 / number
    print(result)
    if number <= 0:
        raise ValueError("Number Cannot be Zero")
except ValueError:
    print("Something went wrong")
except ZeroDivisionError as e:
    print("Error : ", e)
else:
    print(result)
finally:
    print("Program completed...")

class InvalidAgeError(Exception):
    pass

age = -1
if age <= 0:
    raise InvalidAgeError("Age cannot be Zero or Negative")