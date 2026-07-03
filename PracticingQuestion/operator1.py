### Assignment operator 
#####(=)
x = 10
print(x)

###(+=)

x = 10
x += 5
print(x)

####(-=)
x = 10
x -= 3
print(x)

####(*=)
x = 10
x *= 2
print(x)

###(/=)
x = 10
x /= 2
print(x)

###(%=)
x = 10
x %= 3
print(x)

##Logical operator 
####AND OPERATOR

for i in range(1, 11):
    if i >= 3 and i <= 7:
        print(i)
###OR OPERATOR

for i in range(1, 11):
    if i == 2 or i == 8:
        print(i)

###NOT
for i in range(1, 6):
    if not(i == 3):
        print(i)

###Comparison OPERATOR
##(==)
a = 10
b = 10
print(a == b)

##(!=)
a = 10
b = 5
print(a != b)

##(<)
a = 10
b = 5
print(a > b)

##(>)
a = 10
b = 5
print(a < b)

###(>=)
a = 10
b = 10
print(a >= b)

###(<=)
a = 10
b = 15
print(a <= b)
