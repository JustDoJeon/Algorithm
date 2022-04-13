# 문자열 연산
a = "hello"
b = "world"

print(a+" " +b)

a = "String"
print(a*3)

a = "ABCDEF"
print(a[2:4])

# 튜플 자료형
# 리스트와 유사하지만 차이점이있다
# 튜플은 한번선언된 값을 변경할 수 없다.
# 리스트는 [] , 튜플은 ()
# 튜플은 리스트에 상대적으로 공간효율적이다.

# tip
# 서로 다른 성질의 데이터를 묶어서 관리해야할때 사용
# 최단경로알고리즘에서 (비용,노드번호)의 형태로 사용
# 데이터의 나열을 해싱의 키 값으로 사용할때
# 리스트보다 메모리를 효율적으로 사용해야 할 때

ta = (1,2,3,4,5,6,7,8,9,10)

#네번째 원소 출력
print(ta[3])
# 두번째부터 네번째 원소
print(ta[1:4])

# 사전 자료형
"""
키와 값의 쌍을 데이터로 가지는 자료형
순차적으로 저장하지않음
변경 불가능한 자료형을 키로 사용할수있다
해시 테이블을 이용하므로 데이터의 조회 수정에있어서 O(1) 
"""
data = dict()
data['사과']='APPLE'
data['바나나'] = 'banana'
if '사과' in data:
    print("사과를 키로 가지는 데이터가 존재한다.")
# 키를 리스트화해서 사용
print(list(data.keys()))
data.values()

# 집합 자료형
"""
중복을 허용하지 않습니다.
순서가없습니다.
리스트혹은 문자열을 이용해서 초기화 할 수 있다.
이때, set() 함수를 이용한다.
혹은 중괄호 ({}) 안에 각 원소를 콤마를 기준으로 구분하여 삽임함으로써 초기화 할 수 있다.
O(1) 처리시간 
차집합(-), 교집합(|), 합집합(&) 가능
추가 : add() , 여러개 추가 : update([5,6]) , 삭제 : remove()
"""

data_ziphop = set([1,1,2,3,4,4,5])
print(data_ziphop)

# 람다 표현식
def add(a,b):
    return a+b
print(add(3,7))

# 람다 표현식
print((lambda a,b : a + b)(3,7))

## 내장함수에서 자주사용되는 람다함수ㅡ
array = [('홍길동',50),('이순신',32)]
print(sorted(array, key=lambda x:x[1])) #두번째 원소를 기준으로 정렬해라
list1 = [1,2,3,4,5]
list2 = [6,7,8,9,10]
result = map(lambda a,b: a+b,list1,list2)
print(list(result))

# 실전에서 유용한 표준 라이브러리!!
'''
내장함수 : 기본입출력부터 정렬함수까지 기본적인 함수들
itertools : 파이썬에서 반복되는 형태의 데이터를 처리하기 위한 유용한 기능들을 제공합니다.
- 특히 순열과 조합 라이브러리는 코딩 테스트에서 자주 사용됩니다.
heapq : 힙 자료구조를 제공
- 일반적으로 우선순위 큐 기능, 다익스트라 
bisect : 이진탐색 기능제공
collections: 덱, 카운터등의 유용한 자료구조를 포함합니다.
math: 필수적인 수학적 기능을 제공한다.
'''

#sum() , min(), max() ,eval()
result_sum = sum([1,2,3,4,5,6])
print(result_sum)

#순열과 조합
from itertools import permutations
data = ['a','b','c']
result_per = list(permutations(data,3))
print(result_per)

from itertools import combinations
result_comb = list(combinations(data,2))
print(result_comb)

### 중복 순열
from itertools import product
result = list(product(data,repeat=2)) # 2개를 뽑는 모든 순열 구하기
print(result)

### 중복 조합
from itertools import combinations_with_replacement
result = list(combinations_with_replacement(data,2))
print(result)

# 등장횟수를 세는 Counter
from collections import Counter
counter = Counter(['red','blue','red'])
print(counter['blue'])

## 최대 공약수
import math
a =21
b = 14
math.gcd(a,b)
def lcm(a,b):
    return a*b // math.gcd(a,b)
print(lcm(21,14))

