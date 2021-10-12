n = int(input())

count = 0

for h in range(n+1):
    for m in range(60):
        for s in range(60):
            if '3' in str(h) or '3' in str(m) or '3' in str(s):
                count +=1


print(count)

'''
피드백 : 숫자와 문자의 경계를 뛰어넘는 파이썬.. str로 3이라는것 들어가있으면 전부 체크함 
'''