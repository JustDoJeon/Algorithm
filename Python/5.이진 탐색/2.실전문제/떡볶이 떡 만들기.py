'''
내풀이;

answer = []
sum = 0
n, m = list(map(int, input().split()))

array = list(map(int, input().split()))

def solve(arr,target,start,end):
    for i in range(0,len(arr)):
        if i > target:
            answer.append(i-target)
        else:
            continue

    if sum(arr) == m:
        return target
    elif sum(arr) > m:
        return solve(arr,target+1,start,end)
    else:
        return solve(arr,target-1,start,end)

'''

# 정답코드
n, m = list(map(int, input().split()))

array = list(map(int, input().split()))

#이진 탐색을 위한 시작점과 끝점 설정
start = 0
end = max(array)  #아..젤 긴 떡길이를 end 끝점으로..

result = 0
while (start<=end):
    total = 0
    mid = ( start + end) // 2
    # 잘랐을때의 떡의 양 계산
    for x in array:
        if x > mid:
            total += x -mid
    #떡의 양이 부족한 경우 더 많이 자르기 (왼쪽 탐색 방법)
    if total < m:
        end = mid - 1
    #떡의 양이 충분한 경우 덜 자르기 (오른쪽 탐색 방법 )
    else:
        result = mid # 최대한 덜 잘랐을 때가 정답이므로, 여기에서 result에 기록
        start = mid - 1

#정답 출력
print(result)







