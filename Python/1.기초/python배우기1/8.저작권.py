'''
멜로디의 평균값
수록된 곡에 포함되어있는 저작권이 있는 멜로디의 개수 / 수록된 곡의 개수
항상 올림해서 정수로 만듬 평균값

'''

N ,M = map(int, input().split())
avg = 0

answer = 0
answer = (N*(M-1)+1)

print(answer)