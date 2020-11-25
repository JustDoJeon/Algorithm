# 2020/11/25
# 같은숫자는 싫어 프로그래머스 LV1

arr = [1,1,3,3,0,1,1]

def solution(arr):
    answer = []
    for i in range(len(arr)):
        if i ==0:
            answer.append(arr[i])
        elif arr[i] != arr[i-1]:
            answer.append(arr[i])
    return answer

print(solution(arr))
#set => 중복제거되지만 순서는 오름차순됨

