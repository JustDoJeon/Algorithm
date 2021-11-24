#백준 1672번

# N = int(input())
#
# DNA = input()
#
# row = {0:'A' , 1:'G', 2:'C', 3: 'T'}
# col = {0:'A',1:'G', 2:'C',  3: 'T'}
'''
여기서 도저히 노가다 말고 떠오르지않음
딕셔너리의 사용법도 부족했다
'''

#답 => 메모리 초과

N = int(input())

DNA = input()

dic ={
    'A' : {'A': 'A','G':'C','C':'A','T':'G'},
    'G' : {'A': 'C', 'G': 'G','C':'T','T':'A'},
    'C': {'A':'A','G':'T','C':'C','T':'G'},
    'T': {'A':'G','G':'A','C':'G','T':'T'}
}

# print(dic['A']['C']) => A

for _ in range(N-1):
    new = dic[DNA[-1]][DNA[-2]]
    DNA = DNA[:-2] + new
print(DNA)

# 다른닶 => 메모리초과;;

import sys


def haedok(an, an1):
    if an == 'A' and an1 == 'A': return 'A'
    if an == 'A' and an1 == 'G': return 'C'
    if an == 'A' and an1 == 'C': return 'A'
    if an == 'A' and an1 == 'T': return 'G'

    if an == 'G' and an1 == 'A': return 'C'
    if an == 'G' and an1 == 'G': return 'G'
    if an == 'G' and an1 == 'C': return 'T'
    if an == 'G' and an1 == 'T': return 'A'

    if an == 'C' and an1 == 'A': return 'A'
    if an == 'C' and an1 == 'G': return 'T'
    if an == 'C' and an1 == 'C': return 'C'
    if an == 'C' and an1 == 'T': return 'G'

    if an == 'T' and an1 == 'A': return 'G'
    if an == 'T' and an1 == 'G': return 'A'
    if an == 'T' and an1 == 'C': return 'G'
    if an == 'T' and an1 == 'T': return 'T'


n = int(sys.stdin.readline())
dna = input()
if n != 1:
    for i in range(n):
        tmp = dna[n - 2 - i]
        tmp1 = dna[n - 1 - i]
        dna = dna[:-2]
        dna = dna + haedok(tmp, tmp1)
    print(dna)
else:
    print(dna)