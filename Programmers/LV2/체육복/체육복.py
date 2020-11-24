# 프로그래머스 - 체육복문제 ( 그리디 )

import collections

n = 5
lost = [2, 4]
reverse = [3]


def solution(n, lost, reverse):
    answer = ''
    stu = []

    set_reverse = set(reverse) - set(lost)
    set_lost = set(lost) - set(reverse)

    for i in set_reverse:
        if i - 1 in set_lost:
            set_lost.remove(i - 1)
        elif i + 1 in set_lost:
            set_lost.remove(i + 1)
    return n - len(set_lost)


print(solution(n, lost, reverse))
