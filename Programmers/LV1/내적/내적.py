# 프로그래머스 내적 LV1
def solution(a,b):
    answer = 1234567890
    res=0

    for i in range(len(a)):
        res += a[i] *b[i]


    answer = res
    return answer



a = [1,2,3,4]

b = [-3,-1,0,2]

print(solution(a,b))