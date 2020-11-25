# 2020/11/25 문자열 내 마음대로 정렬하기 LV1

# strings = ["sun","bed","car"]
#
# new_strings = sorted(strings)
# print(new_strings)
#
# n=1
# # for i in range(len(strings)):
# #     print(sorted(strings[i][n]))
#
#
# def solution(strings, n):
#     answer =[]
#     result = []
#     for i in range( len(strings)):
#         answer.append(strings[i][n])
#         answer = sorted(answer)
#     print(answer)
#
#     for i in range(len(strings)):
#         for j in range(len(strings)):
#             if strings[j][n] == answer[i]:
#                 print(answer[i])
#                 result.append(strings[j])
#
#     return result
#
#
# print(solution(strings,n)
strings = ["sun", "bed", "car"]
n = 2


def solution(strings, n):
    answer = []
    for i in range(len(strings)):
        # sun = nsun , bed = dbed, car = rcar
        strings[i] = strings[i][n] + strings[i]

    strings.sort()
    print(strings)

    for i in range(len(strings)):
        answer.append(strings[i][1:])

    return answer


print(solution(strings, n))
