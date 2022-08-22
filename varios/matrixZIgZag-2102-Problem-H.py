import numpy

def limite(x,y,n):    
    if(x>=0&x<n&y>=0&y<n):
        return True
        
    return False

dx=[1,-1,0,1]
dy=[0,1,1,-1]
n=int(input())
m=numpy.zeros(shape=(110,110))
x=0
y=0
dato=1
pos=3
for i in range(n*n):
    m[x][y]=dato
    dato+=1
    if(pos==0 | pos==2):
        pos=(pos+1)%4
    sigX = x+dx[pos]
    sigY = y+dy[pos]
    if(i==(n*n)-1):
        break
    while((limite(sigx, sigy, n)==false | m[sigx][sigy]!=0)):
        pos=(pos+1)%4
        sigX = x+dx[pos]
        sigY = y+dy[pos]
    x=sigX
    y=sigY

for i in range(n):
    for j in range(n):
        print(m[i][j],end=" ")
    print()
