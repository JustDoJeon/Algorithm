# from fractions import gcd
#
# def solution(n,m):
#     answer = [gcd(n,m), n*m / gcd(n,m)]
#     return answer
#
#
# print(solution(2,5))

#유클리드 호제법

def gcd(a,b):
    c,d = max(a,b) , min(a,b)
    t = 1
    while t>0:
        t = c % d
        c,d = d , t

    answer = [c, int(a*b/c)]


    return answer

print(gcd(15,12))