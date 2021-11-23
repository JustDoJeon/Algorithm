'''
r : 광고 하지않았을때 수익
e : 광고했을때의 수익
c : 광고 비용
'''

for i in range(int(input())):
    r,e,c = list(map(int,input().split()))
    if r > e-c:
        print("do not advertise")
    elif r < e-c :
        print("advertise")
    else:
        print("does not matter")