import sys

sys.setrecursionlimit(10000)

array = [ 1,5,2,6,3,7,4]

commands = [ [2,5,3],[4,4,1],[1,7,3]]

# print(len(commands))
# print(len(commands[0]))

def solution(array,commands):
    start =0
    end = 0
    k= 0

    answer =[]
    real_ans = []
    for i in range(0,len(commands)):
        start = commands[i][0]
        end = commands[i][1]
        k = commands[i][2]
        answer = array[start-1:end]
        answer.sort()
        real_ans.append(answer[k-1])
    return real_ans

print(solution(array,commands))