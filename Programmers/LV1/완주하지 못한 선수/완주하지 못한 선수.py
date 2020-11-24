# 완주하지 못한 선수  LV1

# 콜렉션 모듈을 이용한 풀이도 숙지해두기
import collections

participant = ["mis", "abc", "cds", "mis"]
completion = ["mis", "aaa", "abc", "cds"]

def solution(part,compl):
    answer =''
    answer = collections.Counter(part) - collections.Counter(compl)
    return list(answer.keys())[0]

# def solution(participant, completion):
#     participant.sort()
#     completion.sort()
#     for i in range(len(completion)):
#         if participant[i] != completion[i]:
#             return participant[i]
#     return participant[len(participant)-1]
