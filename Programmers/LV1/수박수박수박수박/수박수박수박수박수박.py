# 프로그래머스 LV1

def solution(n):
    str_list = "수박" * 5000
    answer = ''
    for i in range(0, n):
        answer += str_list[i]

    return answer


n = 3

print(solution(n))