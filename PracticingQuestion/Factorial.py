## By using while loop 
num=int(input("Enter any number: "))

factorial = 1
i = 1

while i <= num:
    factorial = factorial * i
    i += 1
    print("Factorial =",factorial)

### By using for loop 
num = int(input("Enter a number: "))

fact = 1

for i in range(1, num + 1):
    fact = fact * i

print("Factorial =", fact)
