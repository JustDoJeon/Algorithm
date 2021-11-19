h, m = map(int, input().split())

p = int(input())

h = h+ (p//60)
m = m + (p%60)

if m >= 60:
    h = h+1
    m=m-60

if h>=24:
    h = h-24

print(h, m)
