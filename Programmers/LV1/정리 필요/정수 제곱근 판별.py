import math

def solution(n):
    answer = 0
    root_n = int(math.sqrt(n))

    if root_n * root_n == n:
        answer = (root_n+1)*(root_n+1)
    else:
        answer = -1

    return answer

n = 121

print((solution(n)))