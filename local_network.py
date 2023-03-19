n = int(input())
ips=[]
for i in range(n):
    ips.append(input())
firstTwoComponents=[]
for ip in ips:
    firstTwoComponents.append(ip.split(".")[:2])

for i in range(n):
    for j in range(i+1, n):
        if firstTwoComponents[i] == firstTwoComponents[j]:
            print(f"Machines {i+1} and {j+1} are on the same local network")