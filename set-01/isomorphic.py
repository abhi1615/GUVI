x,y = map(str,input().split())
dict = {}
dict[x[0]]=y[0]
flag = False
for i in range(1,len(x)):
    if dict.get(x[i])==None:
        dict[x[i]]=y[i]
    elif dict.get(x[i])!=y[i]:
        flag=True
        break
if flag==False:
    print("yes")
else:
    print("no")
