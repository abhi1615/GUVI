n=list(map(int,input().strip().split(" ")))
if n[0]>n[1] and n[0]>n[2]:
    print(n[0])
elif n[1]>n[0] and n[1]>n[2]:
    print(n[1])
else:
    print(n[2])