#백준 11047

# 내가푼방법
n , k = map(int,(input().split()))

coin = []
for i in range(n):
    coin.append(int(input()))


coin.sort(reverse=True)

total = 0

for i in range(len(coin)):
    if k >= coin[i]:
        total += k // coin[i]
        k = k % coin[i]

print(total)

'''다른풀이
#입력 받기
N,K = map(int, input().split())
coins = [int(input()) for _ in  range(n)]

#최소 동전 개수 구하기
coin_num = 0

for i in range(1,N+1):
    #인덱스 끝부터 순회 : 마이너스 인덱스
    coin = coins[-i]

    if K>=coin:
        # coin
        num = K 
        K -= coin*num
        coin_num += num

print(coin_num)
'''