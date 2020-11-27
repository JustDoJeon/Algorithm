from collections import deque


def solution(n):
    answer = 0
    queue = deque()

    while n > 0:
        res = n % 3
        n = (int)(n / 3)
        queue.append(res)
        print(queue)
    print("queue",queue)
    while queue:
        for i in range(0, len(queue)):
            temp = 0
            temp = queue.pop()
            print("temp", temp)
            # print("i",i)
            # if temp != 0 :
            answer += temp * (3 ** i)
            # print(answer)
    return answer


n = 125

print(solution(n))
