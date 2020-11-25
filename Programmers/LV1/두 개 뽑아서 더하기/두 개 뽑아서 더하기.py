# 두 개 뽑아서 더하기 - 프로그래머스 LV1

numbers = [5,0,2,7]


def solution(numbers):
    answer = []

    for i in range(len(numbers)):
        for j in range(i+1,len(numbers)):
                answer.append(numbers[i] + numbers[j])
    return answer


print(sorted(solution(numbers)))
