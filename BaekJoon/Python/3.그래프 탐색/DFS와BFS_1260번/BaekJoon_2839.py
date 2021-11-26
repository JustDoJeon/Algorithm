#백준 2839

n = int(input())

bong = 0

while n>0:
    if n % 5 ==0:
        bong += (n//5)
        print(bong)
        break
    n = n-3
    bong +=1
else:
    print(-1)





