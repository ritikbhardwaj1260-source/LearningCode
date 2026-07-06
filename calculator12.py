#### I am going to creat a calculator using python libraries###
## Here I am using math module 

import math

## For giving a heading

print(" PYTHON CALCULATOR ")

### using while loop for various user choices

while True:
   
    ##for taking user's choice
    choice = input("Enter your choice(0-9): ")
    ##Exit the calculator
    if choice == "0":
        print("Calculator closed")
        break
    ##operation that  rquires two numbers##
    elif choice in [ "1","2","3","4","5","6","7"] :
        ###Input Two number 
        a = float(input("Enter the first number: "))
        b = float(input("Enter the second number: "))
        ##Addition##
        if choice == "1":
            print("Result =", a+b)
        ##Substraction##
        elif choice == "2":
            print("Result =",a-b)
        ##Multiplication##
        elif choice == "3":
            print("Result =",a*b)
        ##Division##
        elif choice == "4":
            if b != 0:
            
                print("Result =",a/b)
            else:
                print("Division by zero is not allowed")
        ##Modules##
        elif choice == "5":
            print("Result =",a%b)
        ##Power##
        elif choice == "6":
            print("Result =",a**b)
        ##Floor Division##
        elif choice == "7":
            print("Result =",a//b)
    ##Square Root##
    elif choice == "8":
        num = float(input("Enter any number :"))
        ##Checking if non negative number##
        if num >= 0 :
            print("Result =",math.sqrt(num))
        else :
            print("Square Root is not define for negative numbers")
    ##Factorial##
    elif choice == "9":
        num = int (input("Enter any positive number :"))
        
        ##Checking if non negative number##
        if num >= 0 :
            print("Result =",math.factorial(num))
        else :
            print("Factorial is not define for negative numbers")
    else :
        print("Invalid Choic!")
    

# Menu print only onceC##
print("\nChoose an operation:")
print("0. Exit")
print("1. Addition(+)")
print("2. Subtraction(-)")
print("3. Multiplication(*)")
print("4. Division(/)")
print("5. Modulus(%)")
print("6. Power(^)")
print("7. Floor Division(//)")
print("8. Square Root")
print("9. Factorial")
