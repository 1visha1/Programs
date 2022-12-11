n = int(input("Enter how many numbers are you gining to enter?"))
list=[]
print("Enter the numbers")
for i in range (0,n):
    list.append(int(input(i+1)))
print(list)
g = 0
for i in list:
    for j in list:
        if(i>j):
            if(i>g):
                g =i
        elif(i<j):
            if(g<j):
                g = j

print(g)
# list2 = int(input())
# print(list2)





