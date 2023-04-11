n=int(input())
a=[0]*n
for i in range(n):
    a[i]+=int(input())
m=int(input())
def shift(p):
    for i in range(len(p)-1):
        q=p[i]
        p[i]=p[i+1]
        p[i+1]=q
for i in range(m):
    shift(a)
print(a)