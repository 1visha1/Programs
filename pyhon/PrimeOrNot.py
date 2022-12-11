num = int(input("Enter the number"))
i = 1
p =0
for i in range (1,num):
    if(num%i==0):
        p+=1

if(p == 1):
    print(num," is prime number")
else: 
    print(num," is non-prime number")