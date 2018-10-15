def len():
    n=int(input())
    c=0
    while n>0:
        c+=1
        n//=10
    print(c)

len()