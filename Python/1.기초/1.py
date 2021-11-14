# 1-1 나누어 입력받기 a,b 각각 1 2 입력받는것
a,b = map(int,input().split())

# 1-2 입력 출력 가속
import sys

#input = sys.stdin.readline

input = sys.stdin.readline

c = input()
print(c)

#2-1  우아한 배열 입력
'''
3
1 2 3
4 5 6
7 8 9

'''

MAP_ARR = [list(map(int, input().split())) for i in range(int(input()))]

print(MAP_ARR)
#2-2 정수와 배열이 같은 줄에 들어오는 경우 -  백준 9613에서 사용 가능
'''
4 10 20 20 30 40

3 7 5 12

3 125 15 25

tip : arr 변수 앞에 *를 붙이면 뒤이어 나오는 값이 arr에 배열로 저장이 됩니다.
첫째줄을 예로 들자면 N에는 저장이되며 arr에는 [10,20,30,40]이 저장됩니다.

'''

N, *arr = map(int, input().split())

print(arr)

#2-3 문자열을 한 글자씩 배열에 저장
'''
3
AAAA
ABCA
AAAA

입력값결과
arr = [['A', 'A', 'A', 'A']
       ['A', 'B', 'C', 'A']
       ['A', 'A', 'A', 'A']]
       
이걸 arr2 =['AAAA','ABCA','AAAA']로 바꾸는 과정

tip : list를 input앞에 붙이면 입력받은 문자열을 글자로 잘라서 저장을 합니다. 
'''
arr2 = [input() for _ in range(N)] # 나쁜 코드
arr2 = [list(input()) for _ in range(N)] #좋은코드

#3. 배열 출력
#3-1. 배열을 연결해서 출력 1
'''
arr = [1,2,3,4]
결과 : 1234 

tip : map함수를 이용해서 arr에 저장되어 있는 정수의 값을 string 형식으로 변환합니다. 
그 다음 "".join을 이용하여 공백없이 값을 출력할 수 있습니다.
'''

arr3 = [1,2,3,4]
print("".join(map(str,arr3)))


#3-2 배열을 연결해서 출력2
'''
arr = [1, 2, 3, 4]
를 
1 2 3 4로 [과 ,를 빼고 출력하는 간편한 방법
'''
print(*arr)

