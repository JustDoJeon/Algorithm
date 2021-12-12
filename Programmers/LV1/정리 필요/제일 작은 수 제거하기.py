#제일 작은 수 제거하기

def solution(arr):
    answer = []

    answer = arr

    if len(answer) <= 1:
        answer=[]
        answer.append(-1)
        return answer

    else:
        min_val = min(arr)
        answer.remove(min_val)

    return answer



arr = [10]
print(solution(arr))