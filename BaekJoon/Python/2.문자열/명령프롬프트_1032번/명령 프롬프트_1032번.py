'''
dir a?b.exe 라고 검색하면
첫번째 a 세번째 b익 확장자 exe인거 다나오자나
이문제는

!!! 패턴으로 뭘 쳐야 그 결과가 나오는지..
패턴에는 .과 ? 만 넣을수있다.


'''


n = int(input())

a = list(input())
a_len = len(a)

for i in range(n-1):
    b = list(input())
    for j in range(a_len):
        if a[j] != b[j]:
           a[j] = '?'

print(''.join(a))


