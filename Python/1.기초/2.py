import sys
# 정수
#1-1 최대,최소
ans = sys.maxsize
print(ans)
arr=[1,2,3,4,5]
for num in arr:
    if ans < num:
        ans = num
print(ans)

# 진법 ( 백준 2745, 백준 11005 , 백준 1212 , 백준 1373번 )
#2-1. 10진수 -> 2,8,16 진수 변환
print(bin(42))
print(oct(42))
print(hex(42))

#3.문자열

#3-1 문자열을 거꾸로 !
alph ="ABCD"
alph[::-1]

#3-2 문자열 <-------> 아스키 코드 백준 11654번
ord() # 문자를 아스키코드로 변환하는 함수
chr() # 아스키코드를 문자로 변환하는 함수

#4.배열
#4-1 배열 초기화
'''
내가 제일 헷갈렸던 부분
tip : 배열의 가로 세로를 N,M으로 정하면 편하답니다 !
'''

N,M = map(int(input().split()))
arr = [[0] *N  for _ in range(M)]

#4-2 배열의 원소를 거꾸로 - 백준 2588번
arr.reverse()

#백준 2588번
A = int(input())
B = int(input())
arr_B = [int(i) for i in str(B)]

arr_B.reverse()

for i in range(len(arr_B)):
    print(arr_B[i] * A)
print(A*B)

#4-3 배열 원소 갯수
list.count('something')
str.count('e')

#4-4 원소 중복 제거
# set은 저장된 원소가 유일합니다. 저장된 값이 중복없이 alpha에 저장됩니다.
alpha = ['a','b','c','d','e','f','g','a','b','c','d']
alpha = list(set(alpha))
# 한 단계 더
lst = [[1,2], [1,2] ,[1]]
list(set(map(tuple,lst)))

#4-5 배열 정렬
arr.sort()  #오름차순
arr.sort(reverse=True) #내림차순

arr.sort(key=lambda x:(x[0],x[1])) #배열의 원소가 한 개가 아닌 리스트라면 이 방식 사용

#백준 11650번 문제
#백준 10825번 문제  # 내림차순 arr.sort(key = lambda x : (-x[1],x[2], -x[3],x[0])
#파이썬 삼항 연산자 [ True 조건 ] if 조건 else [ False 조건 ]







