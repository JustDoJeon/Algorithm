n = int(input())

str = input()

li = list(str)

a_num =li.count('A')
b_num = li.count('B')

if a_num > b_num:
    print('A')
elif a_num < b_num:
    print('B')
else:
    print('Tie')