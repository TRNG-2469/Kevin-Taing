import numpy as np

# numbers = np.array([10, 20, 20, 40, 50])
numbers = np.array((10, 20, 20, 40, 50))

# for num in numbers:
#     print(num * 2)

print(numbers + 1)
print(numbers - 1)
print(numbers * 2)
print(numbers / 2)

zeros = np.zeros(5)
print(zeros)

nums = np.arange(2, 10, 2)
print(nums)

print(nums.dtype)

print(numbers.shape)

matrix = np.array([
    [1, 2, 3], 
    [4, 5, 6]
])

print(matrix.shape)

print(numbers.ndim)
print(matrix.ndim)

print(numbers.size)
print(matrix.size)

print("-" * 20)
arr1 = np.array([10, 20, 30])
arr2 = np.array([1, 2, 3])

print(arr1 + arr2)
print(arr1 - arr2)
print(arr1 * arr2)

num1 = np.array([1, 4, 9, 16, 25])
print(np.sqrt(num1))
print("*" * 25)
print(np.sum(num1))
print(np.min(num1))
print(np.max(num1))
print(np.average(num1))

print("=" * 30)
marks = np.array([45, 60, 75, 30, 90])
print(marks >= 75)
passing = marks[marks >= 75]
print(passing)