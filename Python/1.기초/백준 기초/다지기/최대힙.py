import heapq
'''
heap = []

n = int(input())
for i in range(n):
    x = int(input())
    heapq.heappush(heap,x)

print(heap)

max_heap =[]
heap.sort(reverse=True)
print(heap)
'''

#정답 https://mong9data.tistory.com/101
numbers = int(input())
heap = []


#MAX_HEAP
for _ in range(numbers):
    num = int(input())
    if num != 0:
        heapq.heappush(heap,(-num))
    else:
        try:
            print(-1 * heapq.heappop(heap))
        except:
            print(0)