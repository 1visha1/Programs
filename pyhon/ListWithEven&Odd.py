n = int(input("Enter how many numbers are you gining to enter?"))
list=[]
for i in range (0,n):
    list.append(int(input(i+1)))
print(list)
even = []
odd = []
for i in list:
    if(i%2 == 0):
        even.append(i)
    else:
        odd.append(i)

print("Even",even)
print("Odd",odd)
