def binaray_search(array,target,start,end):
    while start <= end:
        mid = (start+end) // 2
        if target==array[mid]:
            return mid
        elif array[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
    return None

#N 입력(가게의 부품개수)
n = int(input())
array = list(map(int, input().split()))

m = int(input())
x = list(map(int, input().split()))

for i in x:
    result = binaray_search(array,i,0,n-1)
    if result == None:
        print('No' ,end = ' ')
    else:
        print('Yes', end=' ')

