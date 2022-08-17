cases = int(input())
for _ in range(cases):
    n = int(input())
    sw = False
    i=0
    while(i*i*i<=n):
        j=0
        while(j*j*j<=n):
            k=0
            while(k*k*k<=n):
                if ((i * i * i) + (j * j * j) + (k * k * k)) == n:
                    sw = True
                    break
                k+=1
            j+=1
        i+=1

    if sw==True:
        print(n, 'se puede expresar como la suma de 3 cubos')
    else:
        print(n, 'no se puede expresar como la suma de 3 cubos')