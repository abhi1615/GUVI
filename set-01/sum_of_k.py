n,k=map(int,input().strip().split())
arr=list(map(int,input().strip().split()))
sum=0
for x in range(0,k):
    sum+=arr[x]
print(sum)