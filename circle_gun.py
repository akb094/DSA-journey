List =[]
for i in range(1,101):
    List.append(i)
i=0
while(len(List)>1):
    s = List[i]
    k = List[i+1] 
    List.remove(k)
    i+= 1
    if i== (len(List)-2):
        k = List[i+1]
        List.remove(k)
        i=0
    if i == (len(List)-1):
        k = List[0]
        List.remove(k)
print(List)