# def solution(x,n):
#     answer = []
#
#     if x < 0:
#         for i in range(x,x*n-1,x):
#             answer.append(i)
#     elif x == 0:
#         for i in range(0,n+1,0):
#             answer.append(i)
#     else:
#         for i in range(x,x*n+1,x):
#             answer.append(i)
#     return answer
#
#
# print(solution(-4,2))
# print(solution(0,2))
# print(solution(4,3))
# print(solution(2,5))

def solution(x,n):
    return [x*i for i in range(1,n+1) ]

print(solution(3,5))