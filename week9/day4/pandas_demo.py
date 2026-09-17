import pandas as pd

marks = pd.Series([70, 80, 90, 60])
print(marks)

marks1 = pd.Series([70, 80, 90, 60], index = ["Alice", "Bob", "Charlie", "Dave"])
print(marks1)
print(marks1["Alice"])
print(marks1.iloc[1])