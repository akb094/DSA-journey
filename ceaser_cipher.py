print("enter a text")
text=input().upper()
letters={}
for i in range(65,91):
    letters[chr(i)]=0
for key in letters.keys():
    for j in range(len(text)):
        if key==text[j]:
            letters[key]+=1
print(letters)
m=max(letters.values())
print(m)
let=letters
for key, value in dict(let).items():
        if value == m:
            del let[key]
m2=max(let.values())
print(m2)
shift=m-m2+1
print(shift)
result=""
for i in range(len(text)):
    result += chr((ord(text[i]) - shift - 65) % 26 + 65)
print(result)