n=int(input())
a=[]
for i in range(0,n):
    a.append(input())
print(a)
a.pop(min(a))
print(a)
print(min(a))