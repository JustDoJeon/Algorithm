'''
1) 성을 모두쓰고 - 로 이어붙인것 => 긴형태
2) 성만 따서 만드는것


'''
ans = []

a = list(input().split('-'))


for i in range(len(a)):
    ans.append(a[i][0])
print(''.join(ans))