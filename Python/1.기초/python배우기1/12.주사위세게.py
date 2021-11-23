li = []
for _ in range(int(input())):
    a, b, c = map(int, input().split())
    if a == b and b == c:
        li.append(10000 + a*1000)
    elif a == b:
        li.append(1000 + a*100)
    elif b == c:
        li.append(1000 + b*100)
    elif c == a:
        li.append(1000 + c*100)
    else:
        li.append(max(a, b, c)*100)
print(max(li))