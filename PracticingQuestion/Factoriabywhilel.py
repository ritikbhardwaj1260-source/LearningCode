## By using while loop 
num = int(input("Enter a number: "))

if num < 0:
    print("Factorial is not defined for negative numbers.")
else:
    factorial = 1
    i = 1

    while i <= num:
        factorial *= i
        i += 1

    print("Factorial =", factorial)