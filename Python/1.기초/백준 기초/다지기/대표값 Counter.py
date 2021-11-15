from collections import Counter

arr = [int(input()) for i in range(10)]

print(sum(arr)//10)
print(max(arr, key = arr.count))

print("=========================")
val = Counter(arr).most_common()
print(sum(arr)//10)
print(val[0][0])