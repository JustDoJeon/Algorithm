# 코딩테스트를 대비해서 중복 문자열을 리스트안에서 어떻게 관리하는지 연습해려고한다.
# 리스트안에서 중복값구하기
word_list = ["123", "테스트", "test", "123", "테스트", "test123", "중복", "중복"]
word_cnt = dict()

# for word in word_list:
#     if word not in word_cnt.keys():
#         word_cnt[word] = 1
#
#     else:
#         word_cnt[word] +=1
#
# print(word_cnt)
#
# for i in range(len(word_cnt)):
#     if i >1:
#         print(list(word_cnt.keys()))
#


# 2. 중복되는 단어들을 제거하는법 - list 에서 제공하는 count함수를 통해 word_list에 존재하는 word의 수를 세어준 뒤 word_cnt에 넣어줍니다.

# set_list = set(word_list)
# for word in list(set_list):
#     word_cnt[word] = word_list.count(word)
# print(word_cnt)


# 3.
from collections import Counter
result = Counter(word_list)
print(result)
print(result.keys())
print(list(result.values()))
