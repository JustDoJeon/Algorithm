#https://heytech.tistory.com/78

from itertools import product

import itertools

lists = [1,2,3,4]
aList = ['A','B','C','D']
sets = [1,2,3]
permut = list(itertools.permutations(lists,2))
print("순열 : ", permut)
comb = list(itertools.combinations(lists,2))
print("조합 : ", comb)
permut_jungbok = list(itertools.product(lists,repeat = 3))
print("중복 순열 : ", permut_jungbok)
comb_jungbok = list(itertools.combinations_with_replacement(lists,3))
print("중복 조합 : ", comb_jungbok)
