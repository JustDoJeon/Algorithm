N = 8

board = []
#한줄에 8x8 받는법 있는디
for i in range(8):
    board.append(list(map(str, list(input()))))
count = 0

for i in range(8):
    for j in range(8):
        if (i % 2 ==0) & (j % 2==0):
            if board[i][j] == 'F':
                count+=1
        if (i % 2 == 1) & (j % 2 == 1):
            if board[i][j] == 'F':
                count+=1

print(count)
'''
하검하검하검하검하검
검하검하검하검하검하
'''



#남의답

'''
chess = []
for _ in range(8):
    chess.append(list(map(str, list(input()))))

answer = 0
for i in range(8):
    for j in range(8):
        if (i + j) % 2 == 0: #하얀칸일 경우
            if chess[i][j] == 'F': #F있을 경우
                answer += 1
print(answer)
'''