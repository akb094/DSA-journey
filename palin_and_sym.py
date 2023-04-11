n=int(input()) 
a=[]
for i in range(n):
    a.append(input())

def palin(k):
    s="" 
    for i in range(len(k)):
        s=k[i]+s 
    if k==s:
        return("true") 
    else:
        return("false")

def sym(k):
    l=len(k)
    if(l%2==0):
        s1=k[0:int(l/2)]
        s2=k[int(l/2):l+1]
    else:
        s1=k[0:int(l/2)]
        s2=k[int(l/2)+1:l+1]
    if(s1==s2):
        return("true")
    else:
        return("false")

for i in range(n):
    if(palin(a[i])=="true" and sym(a[i])=="false"):
        print("Palindrome")
    if(palin(a[i])=="false" and sym(a[i])=="true"):
        print("Symmetry")
    if(palin(a[i])=="true" and sym(a[i])=="true"):
        print("Both property")
    if(palin(a[i])=="false" and sym(a[i])=="false"):
        print("No property")