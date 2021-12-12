'''
1-1입력된 수가 짝수라면 2로 나눕니다
1-2입력된 수가 홀수라면 3을 곱하고 1을 더한다.
2. 결과로 나온수에 같은 작업을 1이 될 때까지 반복한다.
'''

def solution(num):
    answer = 0
    while num != 1:

        if answer >= 500:
            return -1

        if num % 2 == 0:
            num = num / 2
            answer+=1
        else:
            num = num * 3
            num+=1
            answer += 1
    return answer

print(solution(6))