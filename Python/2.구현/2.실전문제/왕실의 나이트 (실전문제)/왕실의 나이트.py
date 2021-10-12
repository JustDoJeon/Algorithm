'''
왕실의 나이트 문제
8x8 체스판
1. 수평으로 두칸 이동한 뒤에 수직으로 한 칸 이동하기
2. 수직으로 두칸 이동한 뒤에 수평으로 한 칸 이동하기
행 :  1 2 3 4 5 6  ( 아래로 주르르ㅡ)
열 : a b c d e f g
a1 입력 -> 갈수있는곳 수 카운팅
'''

'''
a = ord('a')
print(a) => 97 확인
'''

answer = 0

input_data = input()
#row
hang = int(input_data[1])
#column
yeol = int(ord(input_data[0])) - int(ord('a')) +1



# print(yeol)

move = [(-2,1),(-2,-1),(2,1),(2,-1),(1,2),(1,-2),(-1,2),(-1,-2)]

for i in move:
    new_hang = hang + i[0]
    new_yeol = yeol + i[1]

    if(new_hang >=1 and new_hang <=8 and new_yeol >=1 and new_yeol<=8 ):
        answer += 1

print(answer)



