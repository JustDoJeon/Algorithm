# 프로그래머스 프린터 - STACK/QUEUE 레벨2

# 프로그래머스 프린터 - STACK/QUEUE 레벨2

from collections import deque


def solution(priorities, location):
    answer = 0

    # 인쇄 대기목록이 남아있다면 반복
    while len(priorities) != 0:
        # 1. 대기목록의 가장 앞에있는 문서가 나머지 문서들보다 중요도가 높은 경우
        if priorities[0] == max(priorities):
            answer += 1
            priorities.pop(0)  # 먼저 인쇄 == 가장 앞에있는 것 삭제
            if location == 0:
                return answer
            else:
                location -= 1
        # 2. 대기목록의 가장 앞에있는 문서가 중요도가 가장 높지 않은 경우
        else:
            priorities.append(priorities.pop(0))  # 문서를 대기목록 맨 뒤로 이동
            if location == 0:
                location = len(priorities) - 1
            else:
                location -= 1
    return answer

