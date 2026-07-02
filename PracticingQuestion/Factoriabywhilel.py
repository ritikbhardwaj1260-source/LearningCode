## By using while loop 
num=int(input("Enter any number: "))

factorial = 1
i = 1

while i <= num:
    factorial = factorial * i
    i += 1
print("Factorial =",factorial)
