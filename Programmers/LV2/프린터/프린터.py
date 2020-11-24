# 프로그래머스 프린터 - STACK/QUEUE 레벨2

from collections import deque

def solution(priorities,location):

    loc = [i for i in range(len(priorities))]
    result = []
    print(loc)
    while len(priorities)!=0:
        if priorities[0] == max(priorities):
            result.append(loc.pop(0))
            priorities.pop(0)
        else:
            priorities.append((priorities.pop(0)))
            loc.append(loc.pop(0))

    return result.index(location+1)

priorities = [2,1,3,2]
location=2
print(solution(priorities,location))