'''
2
홍길동 95
이순신 77
'''

array = []

n =  int(input())

for i in range(n):
    a,b = input().split()
    array.append((a,b))

#print(array)


print('array[0] : ' ,array[0])

print('array[1] : ' ,array[1])

print('array[0][1] : ' ,array[0][1])

array = sorted(array, key = lambda student: student[1])

for i in array:
    print(i[0], end=' ')
